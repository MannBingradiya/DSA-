import java.util.*;


public class Q_1314 {
    public static void main(String[] args) {
        int[][] matrix  = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(new List[]{spiralOrder(matrix)}));
        
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();



        int rs = 0,re = matrix.length - 1,cs = 0, ce = matrix[0].length - 1;
        while ((rs <= re) && (cs <= ce)) {
            for (int k = cs; k <= ce; k++) {
                list.add(matrix[rs][k]);
            }
            rs++;
            for (int k = rs; k <= re; k++) {
                list.add(matrix[k][ce]);
            }
            ce--;
            if (rs <= re){
                for (int k = ce; k >= cs; k--) {
                    list.add(matrix[re][k]);
                }
            re--;
        }
            if(cs <= ce) {
                for (int k = re; k >= rs; k--) {
                    list.add(matrix[k][cs]);
                }
                cs++;
            }
        }
        return list;
    }


}
