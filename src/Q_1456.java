public class Q_1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }

    private static int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < k; i++) {
            if (vowel(s.charAt(i))) counter++;
        }
        int temp = counter;
        max = Math.max(max,temp);
        for (int i = k; i < s.length(); i++) {
            if (vowel(s.charAt(i))) temp++;
            if(vowel(s.charAt(i - k))) temp--;
            max = Math.max(max,temp);
        }
        return max;
    }

    private static boolean vowel(char charAt) {
        if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
            return true;
        }
        return false;
    }

}
