import java.lang.reflect.Array;
import java.util.Arrays;

public class Q_209 {
    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        System.out.println(minSubArrayLen(nums, target));

    }

    private static int minSubArrayLen(int[] nums, int target) {
        int sum = 0, i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < nums.length; k++) {
            sum += nums[i];
            while (sum >= target) {
                sum -= nums[j++];
                min = Math.min(j - i + 1, min);
            }
        }
        if (min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
