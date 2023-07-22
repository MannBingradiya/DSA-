import java.util.ArrayList;
import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,9,7));
        int n = 3;
        System.out.println(increment(arr, n));
    }

    private static ArrayList<Integer> increment(ArrayList<Integer> arr, int n) {
        int add = 0;
//        while (!arr.isEmpty()) {
//            int temp = arr.get(0);
//            add = (10 * add) + temp;
//            arr.remove(0);
//        }
//        add += 1;

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) < 9){
                arr.set(i, arr.get(i) + 1);
                break;
            }else {
                arr.set(i, 0);
            }
        }
        if (arr.get(0) == 0){
            arr.set(0, 1);
            arr.add(0);
        }
        return arr;
    }
}
