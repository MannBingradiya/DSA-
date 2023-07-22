import java.util.Arrays;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 100;
//        for (int i = 2; i <= n; i++){
//            boolean falg = false;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0){
//                    falg = true;
//                    break;
//                }
//            }
//            if (!falg){
//                System.out.print(i + " ");
//            }
//        }
        for (int i = 2; i <= n; i++){
            boolean falg = false;
            for (int j = 2; j * j <= i; j++) {;
                if (i % j == 0){
                    falg = true;
                    break;
                }
            }
            if (!falg){
                System.out.print(i + " ");
            }
        }
    }
}
