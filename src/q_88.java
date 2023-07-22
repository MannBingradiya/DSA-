import java.util.Arrays;

public class q_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merges(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merges(int[] nums1, int[] nums2, int m, int n) {
//        if (nums1.length == 0) return;
//        if (nums2.length == 0) return;

        int[] nums = new int[m + n];
        int p1 = 0, p2 = 0;
        int temp = 0;
        while (p1 != m && p2 != n){
            if (nums1[p1] > nums2[p2]){
                nums[temp++] = nums2[p2];
                p2++;
            }else {
                nums[temp++] = nums1[p1];
                p1++;
            }
        }
        while(p1 != m){
            nums[temp++] = nums1[p1];
            p1++;
        }
        while(p2 != n){
            nums[temp++] = nums2[p2];
            p2++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }
    }
}
