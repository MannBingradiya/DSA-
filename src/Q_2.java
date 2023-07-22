public class Q_2 {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node nn = new Node(9);
        Node head = nn;

        insertnode(head, 9);
        insertnode(head, 9);
        insertnode(head, 9);
        insertnode(head, 9);
        insertnode(head, 9);
        insertnode(head, 9);




        Node nn2 = new Node(9);
        Node head2 = nn2;

        insertnode(head2, 9);
        insertnode(head2, 9);
        insertnode(head2, 9);

        addTwoNumbers(head, head2);

        printLinkedlist(head);
        printLinkedlist(head2);
    }

    private static Node addTwoNumbers(Node head, Node head2) {
        Node temp1 = head;
        Node temp2 = head2;

        Node newhead = new Node(0);
        Node temp3 = newhead;

        int c = 0;
        sumOfLL(temp1,temp2,temp3,c);

//        while (temp1 != null || temp2 != null) {
//            if (temp1 != null){
//                c += temp1.val;
//                temp1 = temp1.next;
//            }
//            if (temp2 != null){
//                c += temp2.val;
//                temp2 = temp2.next;
//            }
//            temp3 = new Node(c % 10);
//            temp3 = temp3.next;
//            c /= 10;
//        }
//
//        if (c == 1){
//            temp3.next = new Node(1);
//        }

        return newhead.next;
    }

    private static Node sumOfLL(Node temp1, Node temp2, Node temp3, int c) {
        if (temp1 == null && temp2 == null) {
            if (c == 1){
                temp3 = new Node(1);
            }
            return temp3;
        }

        if (temp1 != null){
            c += temp1.val;
            temp1 = temp1.next;

        }
        if (temp2 != null){
            c += temp2.val;
            temp2 = temp2.next;
        }
        temp3 = new Node(c % 10);
        c /= 10;

        sumOfLL(temp1,temp2,temp3.next,c);
        return temp3;
    }

    private static void printLinkedlist(Node head) {
        if (head == null){
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static void insertnode(Node head, int val) {
        Node nn = new Node(val);
        if (head == null){
            head = nn;
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }

}
