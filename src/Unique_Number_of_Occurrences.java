import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 5, 5};
        int n = 5;
        System.out.println(isFrequencyUnique(arr, n));
    }

    private static boolean isFrequencyUnique(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> es : map.entrySet()) {
            if (!set.contains(es.getValue())){
                set.add(es.getValue());
            }else {
                return false;
            }
        }
        return true;
    }
}
