import java.util.Arrays;

public class NewArrayReverse {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max){
                max2 = Math.max(max2, nums[i]);
            }
        }

        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        int n = 2,count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                count++;
            }
            if (count > 1){
                System.out.println("true");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

        int numRay[] = { 6,7,2,1,2,6,8 };

        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                    = numRay[numRay[i] % numRay.length]
                    + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}
