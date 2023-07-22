import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int f = i + 1, l = arr.length - 1;
            while (f < l){
                int sum = arr[i] + arr[f] + arr[l];

                if (sum == 0){
                    al.add(Arrays.asList(arr[i], arr[f], arr[l]));

                    while (f < l && arr[f] == arr[f + 1]) {
                        f++;
                    }

                    // Skip duplicate elements for k
                    while (f < l && arr[l] == arr[l - 1]) {
                        l--;
                    }
                }

                if (sum > 0){
                    l--;
                }else {
                    f++;
                }
            }
        }
        return al;
    }
}
