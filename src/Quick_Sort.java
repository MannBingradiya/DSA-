import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        int low = 0, high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotP = arr[low];
        int i = low;
        int j = high;
        while (i < j){
            while (pivotP >= arr[i] && i < high){
                i++;
            }
            while (pivotP < arr[j] && j > low){
                j--;
            }
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
