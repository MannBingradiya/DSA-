import java.util.Arrays;

public class Remove_duplicate_elements_from_sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 4, 5};
        int n = 7;
        System.out.println(remove_duplicate(arr, n));
        System.out.println(Arrays.toString(arr));
    }

    private static int remove_duplicate(int[] arr, int n) {
//        int counter = 0;
        int first = 0;
        int sec = 1;
        while (sec <= n - 1){
            if (arr[first] != arr[sec]){
                first++;
                arr[first] =arr[sec];
                sec++;
            }else {
                sec++;
            }
        }
        return first;
    }
}
