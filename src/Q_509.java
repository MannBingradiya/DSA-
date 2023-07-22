
public class Q_509 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibb(n));
    }

    private static int fibb(int n) {
        return fibbonaci(n);
    }

    private static int fibbonaci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        if (n == 3){
          return  2;
        } else {
            return (n - 2) + (n - 3);
        }
    }
}
