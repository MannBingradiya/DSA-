import java.util.Stack;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        String str = ")";
        System.out.println(ispar(str));
    }

    private static boolean ispar(String x) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '('){
                stk.push(x.charAt(i));
            }else {
                if (stk.isEmpty()){
                        return false;
                    }
                if (x.charAt(i) == '}' && stk.peek() == '{') {
                    stk.pop();
                } else if (x.charAt(i) == ']' && stk.peek() == '[') {
                    stk.pop();
                } else if (x.charAt(i) == ')' && stk.peek() == '(') {
                    stk.pop();
                }
            }
        }
        if (stk.isEmpty()){
            return true;
        }
        return false;
    }
}
