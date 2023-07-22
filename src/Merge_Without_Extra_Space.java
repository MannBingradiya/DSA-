import java.util.Arrays;

public class Merge_Without_Extra_Space {
    public static void main(String[] args) {
        long[] arr1 = {12, 48};
        long[] arr2 = {3, 4, 5, 28, 39, 42, 47, 49};
        int n = 2, m = 8;
        merge(arr1, arr2, n, m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(long[] arr1, long[] arr2, int n, int m) {
        int i = n - 1, j = 0;
        while (i >= 0 && j < m){
            if (arr1[i] > arr2[j]){
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j++;
                i--;
            }else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
