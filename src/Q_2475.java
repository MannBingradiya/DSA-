import java.util.HashMap;
import java.util.Map;

public class Q_2475 {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }

    private static int unequalTriplets(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n1 : nums){
            map.put(n1, map.getOrDefault(n1, 0) + 1);
        }

        System.out.println(map);
        int i = 0;
//        for (Map.Entry<Integer, Integer> it : map.entrySet()){
//            if ()
//        }

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] )
//        }

        return 0;
    }
}
