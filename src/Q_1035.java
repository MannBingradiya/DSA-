public class Q_1035 {
    public static void main(String[] args) {
        int[] num1 = {1,1,2,1,2};
        int[] num2 = {1,3,2,3,1};
        System.out.println( maxUncrossedLines(num1,num2));
    }

    private static int maxUncrossedLines(int[] num1, int[] num2) {
        int counter = 0, k = 0;
        for (int i = 0; i < num1.length; i++) {
            for (int j = k; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    counter++;
                    k = j + 1;
                    break;
                }
            }
        }
        return counter;
    }
}
