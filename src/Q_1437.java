import java.util.Arrays;

public class Q_1437 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,0,1,0,0,1,0,1};
        int k = 2;
        System.out.println(kLengthApart(nums,k));
    }

    private static boolean kLengthApart(int[] nums, int k) {
        int n = 0;
        int start = 0,end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && n == 0) {
                start = i + 1;
                n++;
            }else {
                if(nums[i] == 1){
                    end = i;
                    int diff = Math.abs(end - start);
                    if (diff < k){
                        return false;
                    }
                    start = i + 1;
                }
            }
        }
        return true;
    }
}
