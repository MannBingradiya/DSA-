import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    public static void main(String[] args) {
        int[] start = {7, 6, 2, 7, 3};
        int[] end = {10, 6, 10, 9, 5};
        int n = 5;
        System.out.println(activitySelection(start, end, n));
    }

    private static int activitySelection(int[] start, int[] end, int n) {
        int count = 1;

        int[][] activity = new int[start.length][2];

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = start[i];
            activity[i][1] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[1]));
        int last = activity[0][1];
        for (int i = 1; i < n; i++) {
            if (activity[i][0] > last){
                count++;
                last = activity[i][1];
            }
        }
        return count;
    }
}
