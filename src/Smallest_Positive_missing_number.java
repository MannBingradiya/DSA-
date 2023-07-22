import java.util.Arrays;

public class Smallest_Positive_missing_number {
    public static void main(String[] args) {
//        int[] arr = {-2, -2, 1, -2, 0, -3, -4, -4, 0};
        int[] arr = {-1, -10, -1, -3, -20};
        int size = 5;
        System.out.println(missingNumber(arr, size));
    }

    private static int missingNumber(int[] arr, int size) {
        Arrays.sort(arr);
        int max = 1;
        for (int i = 0; i < size; i++) {
            if(arr[i] == max){
                max++;
            }
        }
        return max;
    }
}
