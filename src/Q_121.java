public class Q_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int start = 0;
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
                start = i;
            }
        }
        for (int i = start; i < prices.length; i++) {
            max = Math.max(prices[i],max);
        }
        return Math.abs(min - max);
    }
}
