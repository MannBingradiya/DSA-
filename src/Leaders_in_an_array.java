import java.util.ArrayList;

public class Leaders_in_an_array {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 8, 5, 6, 8, 2};
        int n = arr.length;
        System.out.println(leaders(arr, n));
    }

    private static ArrayList<Integer> leaders(int[] arr, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int min = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min < arr[i]){
                al.add(arr[i]);
                min = arr[i];
            }
        }
        for (int i = al.size() - 1; i >= 0; i--) {
            al2.add(al.get(i));
        }
        return al2;
    }
}
