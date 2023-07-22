public class Longest_Common_Prefix_in_an_Array {
    public static void main(String[] args) {
        String[] arr = {"hello", "helrld", "world"};
        int n = arr.length;
        System.out.println(longestCommonPrefix(arr, n));

    }

    private static String longestCommonPrefix(String[] arr, int n) {
        String ans = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = 0;
            String str = "";
            while (index != arr[i].length() && index != arr[i + 1].length()){
                if (arr[i].charAt(index) == arr[i + 1].charAt(index)){
                    str += arr[i].charAt(index);
                }else {
                    break;
                }
                index++;
            }
            if (min > str.length()) {
                ans = str;
                min = str.length();
            }
        }
        if (ans.length() == 0) return "-1";
        return ans;
    }
}
 