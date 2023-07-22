import java.util.Arrays;

public class Q_1720 {
    public static void main(String[] args) {
        int[] encode = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decodeed(encode, first)));
    }

    private static int[] decodeed(int[] encode, int first) {
        int[] temp = new int[encode.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) temp[i] = first;
            else temp[i] = temp[i - 1] ^ encode[i - 1];
        }
        return temp;
    }
}
