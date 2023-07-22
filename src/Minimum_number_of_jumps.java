import java.util.Arrays;

public class Minimum_number_of_jumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));

    }

    private static int minJumps(int[] arr) {
        int jump = 0;
        int i = 0;
        while (i < arr.length - 1){
            if (arr[i] == 0){
                return -1;
            }
                int temp = arr[i];
                i += temp;
                jump++;
        }
        return jump;
    }
}
