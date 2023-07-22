import java.util.Arrays;

public class ThridLargest {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int first = 0,last = nums.length - 1;

        if (nums.length == 2){
            return nums[nums.length - 1];
        }

        while (first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }

        int count = 0,repeat = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeat++;
            } else {
                count++;
                if (count == 2){
                    break;
                }
            }
        }
        return nums[count + repeat];
    }
}
