import java.util.HashSet;

public class Q_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int count = 0,max = 0;
        HashSet<Character> set =  new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))){
                if (s.charAt(i) == s.charAt(i - 1)){
                    count = 0;
                    i--;
                }else {
                    count--;
                    i--;
                }
            }else {
                set.add(s.charAt(i));
                count++;
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
