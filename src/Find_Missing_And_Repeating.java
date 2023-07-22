import java.util.Arrays;

public class Find_Missing_And_Repeating {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 5};
        int n = 5;
        System.out.println(Arrays.toString(findTwoElement(arr, n)));
    }

    private static int[] findTwoElement(int[] arr, int n) {
        int[] ans = new int[2];
        Arrays.sort(arr);
        int orignal_sum = (int) (((long) n * (n + 1)) / 2);
        int total_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            total_sum += arr[i];
        }
        int diff = Math.abs(total_sum - orignal_sum);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans[0] = arr[i];
            }
        }
        if (orignal_sum > total_sum){
            ans[1] = ans[0] + diff;
        }else {
            ans[1] = ans[0] - diff;
        }
        return ans;
    }
}
