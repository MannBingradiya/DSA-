import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        long[] a = {1,2,5,4,0};
        long[] b = {2,4,5,0,5};
        int n = 5;
        System.out.println(check(a, b, n));
    }

    private static boolean check(long[] a, long[] b, int n) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (long i : a){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(b[i]) || map.get(b[i]) == 0) {
                return false;
            } else {
                map.put(b[i], map.get(b[i]) - 1);
            }
        }
        return true;
     }
}
