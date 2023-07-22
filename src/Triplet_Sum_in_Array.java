import java.util.Arrays;

public class Triplet_Sum_in_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6};
        int n = 5, x = 10;
        System.out.println(find3Numbers(arr, n, x));
    }

    private static boolean find3Numbers(int[] arr, int n, int x) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int f = i + 1, l = n - 1;
            while (f < l){
                int sum = arr[i] + arr[f] + arr[l];
                if (sum == x){
                    System.out.println(arr[i] + " " + arr[f] + " " + arr[l]);
                    return true;
                }
                if (sum > x){
                    l--;
                }else {
                    f++;
                }
            }
        }
        return false;
    }
}
