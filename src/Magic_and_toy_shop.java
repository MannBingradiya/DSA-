public class Magic_and_toy_shop {
    public static void main(String[] args) {
        int[] price = {3,4,6,2,6};
        int[] magical_price = {1,2,5,1,3};
        int m = 13;
        int n = 5;
        System.out.println(minimumMagic(price, magical_price, m ,n));
    }

    private static int minimumMagic(int[] price, int[] magical_price, int m, int n) {
        int mprice = 0;
        int counter = n;
        for(int i = 0; i < n; i++){
            if (magical_price[i] < price[i]){
                mprice += magical_price[i];

            }else {
                mprice += price[i];
                counter--;
            }
        }
        if (m < mprice){
            return -1;
        }
        int diff = m - mprice;
        for (int i = 0; i < n; i++) {
            int temp = Math.abs(magical_price[i] - price[i]);
//            if ()
        }
        return counter;
    }
}
