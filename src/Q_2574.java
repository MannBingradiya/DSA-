import java.util.Arrays;

public class Q_2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }

    private static int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length],right = new int[nums.length];
        int j = right.length - 2;
        for (int i = 1; i < left.length; i++) {
            left[i] = nums[i - 1] + left[i - 1];
            right[j] = nums[j + 1] + right[j + 1];
            j--;
        }

        for (int i = 0; i < nums.length; i++) nums[i] = Math.abs(left[i] - right[i]);
        return nums;
    }
}
