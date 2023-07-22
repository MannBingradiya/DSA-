import java.util.Stack;

public class Q_232 {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public Q_232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public static void main(String[] args) {
        Q_232 queue = new Q_232();
        queue.pushes(10);
        queue.pushes(20);
        queue.pushes(30);
        queue.print();
        queue.pops();
        queue.pushes(40);
        queue.pushes(50);
        queue.peek();
        queue.print();
    }
    private int peek() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    private int pops() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    private void print() {
        System.out.println(s1);
        System.out.println(s2);
    }

    private void pushes(int i) {
        s1.push(i);
    }
}
