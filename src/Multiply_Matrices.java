import java.util.Arrays;

public class Multiply_Matrices {
    public static void main(String[] args) {
        int n = 2;
        int[][] a = {{7, 8}, {2 , 9}};
        int[][] b = {{14, 5}, {5, 18}};
        int[][] c = new int[n][n];
        multiply(a, b, c, n);
        System.out.println(Arrays.deepToString(c));
    }

    private static void multiply(int[][] a, int[][] b, int[][] c, int n) {
        for (int i = 0; i < n - 1; i++) {
            int sum = a[0][i] * a[0][i];
            for (int j = 0 ; j < n - 1; j++) {
                sum += a[i][j] * b[j][i];

            }
        }
    }

}
