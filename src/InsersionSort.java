import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
        int[] arr = {90,73,58,32,3,8};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]){
                    arr[j + 1] = arr[j];
                    j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
