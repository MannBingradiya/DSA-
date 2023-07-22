import java.util.Map;
import java.util.TreeMap;

public class Q_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }

    private static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        return sb.toString();
    }

}
