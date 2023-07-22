import java.util.Arrays;

public class Rotate_Arra {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int n = 5, d = 3;
        rotateArr(arr, n, d);
        System.out.println(Arrays.toString(arr));


        int[] arr1 = {9, 8, 7, 6, 4, 2, 1, 3};
        int n1 = 8;
        rotate(arr1, n1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void rotate(int[] arr, int n) {
        swap(arr, 0, n - 1);
        swap(arr, 1, n - 1);
    }

    private static void rotateArr(int[] arr, int n, int d) {
        d %= n;
        swap(arr, 0, d - 1);
        swap(arr, d, n - 1);
        swap(arr, 0, n - 1);

    }

    private static void swap(int[] arr, int i, int j) {
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
