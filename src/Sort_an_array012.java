import java.util.Arrays;

public class Sort_an_array012 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 0, 1, 2};
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr, int n) {
        int start = 0, end = arr.length - 1;
        while (start < end){
            if (arr[start] > 0 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }else if(arr[start] == 0){
                start++;
            }else if(arr[end] > 0){
                end--;
            }
        }
        start = 0;
        end = arr.length - 1;

        while (start < end){
            if (arr[start] == 0){
                start++;
            }
            if (arr[start] == 2 && arr[end] == 1){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }else if(arr[start] == 1){
                start++;
            }else if(arr[end] == 2){
                end--;
            }
        }
    }
}
