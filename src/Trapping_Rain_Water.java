import java.util.ArrayList;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {4, 4, 0, 3};
        int n = 4;
        System.out.println(trappingWater(arr, n));
    }

    private static long trappingWater(int[] arr, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
            if (arr[i + 1] < max){
                if (arr[i + 1] != arr.length - 1){
                    al.add(max - arr[i + 1]);
                }else {
                }
            }else {
                max = Math.max(max, arr[i + 1]);
            }
        }
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }
}
