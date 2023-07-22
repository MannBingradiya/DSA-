import java.util.HashMap;

public class Largest_subarray_with_0_sum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 10, 7, 23};
        System.out.println(maxLen(arr));
    }

    private static int maxLen(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int cursum = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++){
            cursum+=arr[i];
            if(cursum==0) len = i+1;

            if(!h.containsKey(cursum)){
                h.put(cursum, i);
            }
            if(h.containsKey(cursum)){
                len = Math.max(len, i-h.get(cursum));
            }
        }
        return len;
    }

}
