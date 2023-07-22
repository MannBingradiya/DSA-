public class q_2652 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }

    private static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
