public class Q_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "", str2 ="";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }
        if (str1.equals(str2)){
            return true;
        }
        return false;
    }
}
