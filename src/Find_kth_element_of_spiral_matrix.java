import java.util.ArrayList;
import java.util.Arrays;

public class Find_kth_element_of_spiral_matrix {
    public static void main(String[] args) {
        int[][] A = {{3, 3, 4, 5, 6, 4},
                {5, 6, 7, 5, 6, 7},
                {9, 10, 11, 6, 3, 55},
                {13, 14, 15, 3, 7, 5}};
        int n = 4, m = 6, k = 5;
        System.out.println(spiral(A, n, m, k));
        System.out.println(findK(A, n, m, k));
    }

    private static int findK(int[][] a, int n, int m, int k) {
        int rs = 0, cs = 0, re = n - 1, ce = m - 1;
        int count = 0;
        while (rs <= re && cs <= ce){
            for (int i = cs; i <= ce; i++) {
                count++;
                if (count == k) return a[rs][i];
            }

            rs++;
            for (int i = rs; i <= re; i++) {
                count++;
                if (count == k) return a[i][ce];
            }
            ce--;
            for (int i = ce; i >= cs; i--) {
                count++;
                if (count == k) return a[re][i];
            }
            re--;
            for (int i = re; i >= rs; i--) {
                count++;
                if (count == k) return a[i][cs];
            }
            cs++;
        }
        return -1;
    }

    private static int spiral(int[][] a, int n, int m, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int offset = 0;
        int r = 0, c = 0;
        while (offset < n / 2){
            while (c < m - offset){
                ans.add(a[r][c]);
                c++;
            }
            c--;
            r++;
            while (r < n - offset){
                ans.add(a[r][c]);
                r++;
            }
            r--;
            c--;
            while (c >= offset){
                ans.add(a[r][c]);
                c--;
            }
            c++;
            r--;
            offset++;
            while (r >= offset){
                ans.add(a[r][c]);
                r--;
            }
            r++;
            c++;
        }
        return ans.get(k - 1);
    }
}
