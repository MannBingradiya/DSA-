public class Q_2148 {
    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        System.out.println(countElements(nums));
    }

    private static int countElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max && nums[i] > min){
                counter++;
            }
        }
        return counter;
    }
}
