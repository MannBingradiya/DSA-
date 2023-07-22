import java.util.LinkedList;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Q_206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        insertNode(head,2);
        insertNode(head,3);
        insertNode(head, 4);
        insertNode(head,5);
        printNode(head);
        System.out.println(reverseList(head));
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode res = reverseList(head.next);
        head.next.next = head;
        int val = head.next.next.val;
        head.next = null;

        return res;
    }

    private static ListNode reverse(ListNode temp, ListNode rev) {
        if(temp == null){
            return temp;
        }
        reverse(temp.next, rev);
        return temp.next;
    }

    private static void printNode(ListNode head) {
        if (head == null){
            System.out.println("blanlk");
            return;
        }

        ListNode temp = head;
        while (temp != null){
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    private static void insertNode(ListNode head,int nval) {
        ListNode nn = new ListNode(nval);

        if(head == null){
            head = nn;
            return;
        }

        ListNode tenmp = head;

        while (tenmp.next != null) {
            tenmp = tenmp.next;
        }
        tenmp.next = nn;
    }



}
