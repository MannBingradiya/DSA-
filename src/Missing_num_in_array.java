import java.util.Arrays;

public class Missing_num_in_array {
    public static void main(String[] args) {
        int[] A = {1,2,3,5};
        System.out.println(missingNumber(A, 5));
    }

    private static int missingNumber(int[] a, int length) {
//        Arrays.sort(a);
        int sum = (length) * (length + 1) / 2;
        for (int i = 0; i < length - 1; i++) {
            sum -= a[i];
        }
        return sum;
    }
}
