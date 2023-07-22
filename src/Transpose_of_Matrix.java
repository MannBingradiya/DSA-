import java.util.Arrays;

public class Transpose_of_Matrix {
    public static void main(String[] args) {
        int[][] a = {{1},{-9}};
        int n = 1;
        transpose(a, n);
        System.out.println(Arrays.deepToString(a));
    }

    private static void transpose(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
