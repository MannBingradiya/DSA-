import java.util.Arrays;

public class Find_triplets_with_zero_sum {
    public static void main(String[] args) {
        int[] arr = {63, -30, 4, 13, 85, -6, 11};
//        int[] arr = {42, -21, 13, -26, 79, 40, 62, -60, 29, -23, 97, -39, 40, -35, 26, -54, 87, 5, 77, 21, 28, 10, 32, -22, 25, 21, 3};
        int n = 7;
        System.out.println(findTriplets(arr, n));
    }

    private static boolean findTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if(arr[i] > 0) break;
            int f = i + 1, l = n - 1;
            while (f < l){
                int sum = arr[i] + arr[f] + arr[l];
                if(sum == 0){
                    return true;
                }else if (sum > 0){
                    l--;
                }else {
                    f++;
                }
            }
        }
        return false;
    }
}
