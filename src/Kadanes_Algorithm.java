public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4};
        int n = 4;
        System.out.println(maxSubarraySum(arr, n));
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long sum = arr[0];
        long max = sum;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum < arr[i] && arr[i] < 0){
                sum = 0;
                continue;
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
