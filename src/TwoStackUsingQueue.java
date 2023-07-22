
public class TwoStackUsingQueue {
    public static void main(String[] args) {
        int n = 5;
        int[] stack = new int[n];
        int[] stack2 = new int[n];
        int top = -1, top2 = -1;
        top = stackpush(top, stack, n, 10);
        top = stackpush(top, stack, n, 20);
        top = stackpush(top, stack, n, 30);
        top = stackpush(top, stack, n, 40);


        satckempty(top);
        satck2empty(top2,stack2);


        if (satck2empty(top2,stack2)){
            while (top <= 0){
                stack2[++top2] = stack[top--];
            }
        }
        stackprint(stack, top);
        stack2print(stack2,top2);
    }

    private static void stack2print(int[] stack2, int top2) {
        if (top2 < 0){
            System.out.println("stack is empty to print");
        }
        int temp = top2;
        while (temp >= 0){
            System.out.print(stack2[temp--] + " ");
        }
        System.out.println();
    }

    private static int stack2push(int[] stack2, int top2, int[] stack, int i) {
        stack2[++top2] = stack[i];
        return top2;
    }

    private static boolean satck2empty(int top2, int[] stack2) {
        if (top2 == -1){
            return true;
        }
        return false;
    }

    private static boolean satckempty(int top) {
        if (top == -1){
            return true;
        }
        return false;
    }

    private static void stackprint(int[] stack, int top) {
        if (top < 0){
            System.out.println("stack is empty to print");
        }
        int temp = top;
        while (temp >= 0){
            System.out.print(stack[temp--] + " ");
        }
        System.out.println();
    }

    private static int stackpop(int top, int[] stack) {
        if (top == -1){
            System.out.println("stak is emapty");
            return top;
        }
        return --top;
    }

    private static int stackpush(int top, int[] stack, int n,int val) {
        if (top == (n - 1)){
            System.out.println("stack is overflow");
            return top;
        }
        stack[++top] = val;
        return top;
    }


}
