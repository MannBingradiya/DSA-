class Item{
    int value, weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}
public class Fractional_Knapsack {
    public static void main(String[] args) {
        Item arr[] = new Item[3];
        arr[0] = new Item(60, 10);
        arr[1] = new Item(100, 20);
        arr[2] = new Item(120, 30);
        int w = 50;

        System.out.println(fractionalKnapsack(arr.length, arr, w));
    }

    private static double fractionalKnapsack(int length, Item[] arr, int w) {
        int pw = w, add = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].weight < pw){
                pw -= arr[i].weight;
                add += arr[i].value;
            }else {
                double temp  = (float) pw / arr[i].weight ;
                add += arr[i].value * (temp);
            }
        }
        return add;
    }
}
