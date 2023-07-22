public class Row_with_max_1s {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0}};

        int n = 4, m = 4;
        System.out.println(rowWithMax1s(arr, n, m));
    }

    private static int rowWithMax1s(int[][] arr, int n, int m) {
        int max = Integer.MIN_VALUE;
        int index = 0, i = 0, col = m - 1;
        int count = 0;

        while (i < n && col >= 0) {
            if (arr[i][col] == 1) {
                col--;
                index = i;
            }else {
                i++;
            }
        }
        return index;
    }
}
