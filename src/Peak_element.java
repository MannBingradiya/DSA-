public class Peak_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = 3;
        System.out.println(peakElement(arr, n));
    }

    private static int peakElement(int[] arr, int n) {
        int i = 0, j = arr.length - 1;
            while (i < j){
                int mid = i + (j - i) / 2;
                if (arr[mid] < arr[mid + 1]){
                    i = mid + 1;
                }else {
                    j = mid;
                }
        }
            return j;
    }
}
