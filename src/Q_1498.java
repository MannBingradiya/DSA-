public class Q_1498 {
    public static void main(String[] args) {
        int[] nums  ={3,5,6,7};
        int target = 9;
        System.out.println(numSubseq(nums, target));
    }

    private static int numSubseq(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int counter = 0;
        while (left <= right){
            int mid = right - (right + left) / 2;

            if (target > nums[mid]){
                left = mid + 1;
                int first = 0, last = left;
                while (first < last){
                    if (nums[first] + nums[last] <= target){
                        counter++;
                        last--;
                    }else if (nums[first] + nums[first] <= target){
                        counter++;
                    }else if (nums[last] + nums[last] <= target){
                        counter++;
                    }
                    if (nums[first] + nums[last] > target){
                        last--;
                    }
                }
                break;
            }else {
                right = mid - 1;
            }
        }
        return counter;
    }
}
