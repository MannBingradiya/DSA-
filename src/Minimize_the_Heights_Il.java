import java.util.Arrays;

public class Minimize_the_Heights_Il {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5, n = 10;
        System.out.println(getMinDiff(arr, k, n));
    }

    private static int getMinDiff(int[] arr, int k, int n) {

        int[] temparr = new int[arr.length];

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - k < 0){
                continue;
            }else {
                temparr[i] = arr[i] - k;
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < temparr.length; i++) {
            min = Math.min(min, temparr[i]);
            max = Math.max(max, temparr[i]);
        }
        return max - min;
    }
    
}
