public class Search_an_Element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4,x = 3;
        System.out.println(search(arr, n, x));
    }

    private static int search(int[] arr, int n, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
