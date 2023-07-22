import java.util.HashMap;
import java.util.Map;

public class Array_Subset_of_another_array {
    public static void main(String[] args) {
        long[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b, a.length, b.length));


        long z = 1L;
        System.out.println(z);
    }

    private static String isSubset(long[] a, long[] b, long length, long length1) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (long i : a){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])){
                map.replace(b[i], map.get(b[i]) - 1);
                if (map.get(b[i]) == 0){
                    map.remove(b[i]);
                }
            }else {
                return "No";
            }
        }
        return "Yes";
    }
}
