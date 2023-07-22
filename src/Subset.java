import java.util.ArrayList;
import java.util.List;

public class Subset {

    private static void allsubset(int[] nums, List<Integer> output, int index, List<List<Integer>> mainlist) {
//        if (mainlist.contains(output)) return;
        if (index >= nums.length) {
            mainlist.add(new ArrayList<>(output));
            return;
        }
        allsubset(nums, output, index + 1, mainlist);

        int ele = nums[index];
        output.add(ele);
        allsubset(nums, output, index + 1, mainlist);
        output.remove(output.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));



//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                for (int k = j; k < arr.length; k++) {
//                    System.out.print( arr[k] + " ");
//                }
//                System.out.println();
//            }
//        }

    }

    private static List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        allsubset(nums,output,index,mainlist);
        return mainlist;
    }


}
