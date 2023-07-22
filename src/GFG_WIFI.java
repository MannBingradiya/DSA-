public class GFG_WIFI {
    public static void main(String[] args) {
        int N = 10,X = 1;
        String s = "1100001011";
        System.out.println(wifiRange(N,X,s));
    }

    private static boolean wifiRange(int N, int X, String s) {
        char[] ch = s.toCharArray();
        int c = X;
        for (int i = 0; i < s.length() - 1; i++) {
            if (ch[i] == '1') c = X;
            if (ch[i] >= '1') {
                if (c != 0 && ch[i + 1] != '1') {
                    ch[i + 1] = '2';
                    c--;
                }
            }
        }
        for (int i = s.length() - 1; i > 0; i--) {
            if (ch[i] == '1') c = X;
            if (ch[i] >= '1') {
                if (c != 0 && ch[i - 1] != '1') {
                    ch[i - 1] = '2';
                    c--;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') return false;
        }
        return true;
    }
}
