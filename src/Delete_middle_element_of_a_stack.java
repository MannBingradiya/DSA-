import java.util.ArrayList;
import java.util.Stack;

public class Delete_middle_element_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        int n = stk.size();

        deleteMid(stk, n);
        System.out.println(stk);
    }

    private static void deleteMid(Stack<Integer> stk, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(stk.peek());
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            if (i != mid){
                al.add(stk.pop());
            }else {
                stk.pop();
            }
        }
        for (int i = al.size() - 1; i >= 0; i--) {
            stk.push(al.get(i));
        }
    }
}
