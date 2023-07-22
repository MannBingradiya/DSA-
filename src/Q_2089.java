import java.util.*;

public class Q_2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getKey() == target){
                al.add(count);
            }else {
                count++;
            }
        }
        return al;
    }
}