public class Stock_buy_and_sell_II {
    public static void main(String[] args) {
        int[] a = {1};
        int n = 1;
        System.out.println(stockBuyAndSell(a, n));
    }

    private static int stockBuyAndSell(int[] a, int n) {
        int maxProfit = 0;

        if (n == 1) return 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]){
                maxProfit += a[i + 1] - a[i];
            }
        }
        return maxProfit;
    }
}
