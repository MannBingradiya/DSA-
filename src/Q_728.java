import java.util.ArrayList;
import java.util.List;

public class Q_728 {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i,defaultcounter = 0, counter = 0;
            while (temp != 0){
                defaultcounter++;
                int n = temp % 10;
                if ( n != 0 && i % n == 0){
                    counter++;
                }
                temp /= 10;
            }
            if (counter == defaultcounter){
                al.add(i);
            }
        }
        return al;
    }
}
