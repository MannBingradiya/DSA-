public class Q_541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
    }

    private static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = k;
        while (start < s.length()){
            end = Math.min(s.length() - 1, start + k - 1);
            swaps(ch,start,end);

            start = start + (k * 2);
        }
        return new String(ch);
    }

    private static void swaps(char[] ch, int start, int end) {
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
