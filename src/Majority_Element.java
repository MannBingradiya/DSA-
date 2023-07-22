import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        int n = 5;
        System.out.println(majorityElement(arr, n));
    }

    private static int majorityElement(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int contain =  n / 2;
        for (Map.Entry<Integer, Integer> es : map.entrySet()) {
            if (es.getValue() > contain) {
                return es.getKey();
            }
        }
        return -1;
    }
}
