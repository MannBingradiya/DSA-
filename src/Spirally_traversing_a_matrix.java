import java.util.ArrayList;

public class Spirally_traversing_a_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
            int r = 3, c = 4;
        System.out.println(spirallyTraverse(matrix, r, c));
    }

    private static ArrayList<Integer> spirallyTraverse(int[][] matrix, int re, int ce) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rs = 0, cs = 0;
        while (rs < re && cs < ce) {
            for (int i = cs; i < ce; i++) {
                ans.add(matrix[rs][i]);
            }
            rs++;

            for (int i = rs; i < re; i++) {
                ans.add(matrix[i][ce - 1]);
            }
            ce--;

            if (rs < re){
                for (int i = ce - 1; i >= cs; i--) {
                    ans.add(matrix[re - 1][i]);
                }
                re--;
            }
            if (cs < ce){
                for (int i = re - 1; i >= rs; i--) {
                    ans.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return ans;
    }

}
