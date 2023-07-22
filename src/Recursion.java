import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(PrintName(n));

//        int[] arr = {1, 2, 3, 4, 5};
//        reverseArr(0, arr);

//        String str = "madam";
//        System.out.println(palindrom(str, 0));

//        int n = 6;
//        System.out.println(fibonachi(n));

//        int[] arr1 = {3, 1, 2};
//        subset(0, arr1, new ArrayList<>(), 0);

        int[] arr2 = {1, 2, 1};
        System.out.println(subsetcounter(0,arr2,new ArrayList<>(), 0));

     }

    private static int subsetcounter(int i, int[] arr2, ArrayList<Object> al, int sum) {
        if (i == arr2.length){
            if (sum == 2) return 1;
            else return 0;
        }
        al.add(arr2[i]);
        int l = subsetcounter(i + 1, arr2, al, sum += arr2[i]);
        al.remove(al.size() - 1);
        int r = subsetcounter(i + 1, arr2, al, sum -= arr2[i]);
        return l + r;
    }

    private static boolean subset(int i, int[] arr1, ArrayList<Object> al, int sum) {
        if (i == arr1.length) {
            if (sum == 3){
                System.out.println(al);
                return true;
            }
            else return false;
        }
        al.add(arr1[i]);
        if (subset(i + 1, arr1, al, sum += arr1[i]) == true){
            return true;
        }
        al.remove(al.size() - 1);
        if(subset(i + 1, arr1, al, sum -= arr1[i]) == true){
            return true;
        }
        return false;
    }

    private static int fibonachi(int n) {
        if (n <= 1) return n;
        int last = fibonachi(n - 1);
        int slast = fibonachi(n - 2);
        return last + slast;
    }

    private static boolean palindrom(String str, int i) {
        if (i == str.length() / 2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return palindrom(str, i + 1);
    }

    private static void reverseArr(int i, int[] arr) {
        if (i >= arr.length / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArr(i + 1, arr);
    }

    private static int PrintName(int n) {
        if (n == 1) {
            return 1;
        }
        return n * PrintName(n - 1);
    }
}
