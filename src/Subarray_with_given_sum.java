import java.util.ArrayList;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        System.out.println(subarr(arr, arr.length, 468));
    }

    private static ArrayList<Integer> subarr(int[] arr, int n, int s) {
        int sum = 0, i = 0, j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(i);
        if(s==0){
            al.add(-1);
            return al;
        }
        while (j < n){
            sum += arr[j];
            while (sum > s) {
               sum -= arr[i];
               i++;
            }
            if (sum == s) {
                al.set(0,i + 1);
                al.add(j + 1);
                return al;
            }
            j++;
        }
        al.set(0,-1);
        return al;
    }
}
