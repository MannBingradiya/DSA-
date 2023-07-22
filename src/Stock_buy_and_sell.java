import java.util.ArrayList;
import java.util.Arrays;

public class Stock_buy_and_sell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695, 30, 329};
        int n  = 7;
        System.out.println(stockBuySell(arr, n));
     }

    private static ArrayList<ArrayList<Integer>> stockBuySell(int[] arr, int n) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
         int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                ArrayList<Integer> al2 = new ArrayList<>();
                al2.add(i);
                al2.add(i + 1);
                al.add(al2);
            }
        }
        return al;
    }
}
