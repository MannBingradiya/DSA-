import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Q_1539 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] - mid - 1 < k){
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }
        return first + k;
    }
}
