import java.util.*;

public class Q_697 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,5,3,2};
//        int[] nums = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println(findShortestSubArray(nums));
    }

    private static int findShortestSubArray(int[] nums) {
//        if (nums.length == 1) return 1;
//        HashMap<Integer, Integer> hm = new HashMap<>(),first1 = new HashMap<>();
//        int first = 0,sec = 0;
//
//
//        for (int i = 0; i < nums.length; i++) {
//            first1.putIfAbsent(nums[i], i);
//            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//            if (hm.get(nums[i]) > sec){
//                sec = hm.get(nums[i]);
//                first = i - first1.get(nums[i]) + 1;
//            }else if (hm.get(nums[i]) == sec){
//                first = Math.min(first, i - first1.get(nums[i]) + 1);
//            }
//        }
//        return first;
        if (nums.length == 0 || nums == null) return 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});  // the first element in array is degree, second is first index of this key, third is last index of this key
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (value[0] > degree){
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree){
                res = Math.min( value[2] - value[1] + 1, res);
            }
        }
        return res;
    }
}
