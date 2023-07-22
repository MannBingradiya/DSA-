import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_array_in_groups {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(36, 93, 64, 48, 96, 55, 70, 0, 82, 30, 16, 22, 38, 53, 19, 50, 91, 43, 70, 88, 10, 57, 14, 94, 13, 36, 59, 32, 54, 58, 18, 82, 67));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int n = 5, k = 2;
        reverseInGroups(arr, n, k);
        System.out.println(arr);
        System.out.println(k / 2);
    }

    private static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
//        if (k > n - 1) {
//            k = n;
//        }

        int f = 0, l = 0;
        for (int i = 0; i < n; i+=k) {
            f = i;
            l = i + k - 1;
            while (f < l){
                if (l > n - 1) l = n - 1;
                int ext = arr.get(f);
                arr.set(f, arr.get(l));
                arr.set(l, ext);
                f++;l--;
            }
        }

//        int temp = k;
//        int i = 0;
//        while ((temp * 2) < n){
//            i = temp;
//            temp *= 2;
//        }
//        int j = temp - 1;
//        while (i < j) {
//            int ext = arr.get(i);
//            arr.set(i, arr.get(j));
//            arr.set(j, ext);
//            i++;
//            j--;
//            if ((i >= j) && (i != k / 2)) {
//                j = temp / 2;
//            }
//        }
    }
}
