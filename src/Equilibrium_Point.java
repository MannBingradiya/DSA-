public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int n = 5;
        System.out.println(equilibriumPoint(arr, n));
    }

    private static int equilibriumPoint(int[] arr, int n) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (sum == sum1){
                return i + 1;
            }else {
                sum1 += arr[i];
            }
        }
        return -1;
    }
}

