import java.util.Arrays;

public class Q_1313 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    private static int[] decompressRLElist(int[] nums) {
        int sum = 0, inc = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        System.out.println(sum);
        int[] arr = new int[sum];
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(arr,inc,inc+nums[i],nums[i + 1]);
            inc+=nums[i];
        }
        return arr;
    }
}
