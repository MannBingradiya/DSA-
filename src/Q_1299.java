import java.util.Arrays;

public class Q_1299 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    private static int[] replaceElements(int[] arr) {
        int[] num = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1){
                num[i] = -1;
                continue;
            }
            if (num[i + 1] < arr[i+1]) num[i] = arr[i + 1];
            else num[i] = num[i + 1];
        }
        return num;
    }
}
