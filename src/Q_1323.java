public class Q_1323 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    private static int maximum69Number(int num) {
//        return Integer.parseInt(String.valueOf(num).replaceAll("6","9"));

        String str = String.valueOf(num);
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '6'){
                ch[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(ch));
    }
}
