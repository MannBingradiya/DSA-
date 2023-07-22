import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Maximum_of_all_subarrays_of_size_k {
    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 7, 9, 4, 1, 2, 3, 4};
        int k = 4, n = 10;
        System.out.println(max_of_subarrays(arr, k, n));
    }

    private static ArrayList<Integer> max_of_subarrays(int[] arr, int k, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i]);
        }
        int sec_max = 0;
        al.add(max);
        for (int i = k; i < n; i++) {

        }
        return al;

//        Queue<Integer> que = new LinkedList<>();
//        for (int i = 0; i < ; i++) {
//            que.add()
//        }
    }
}
