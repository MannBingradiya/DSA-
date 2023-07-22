import java.util.*;


public class Linkedlist {
    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }


    }
    public static void main(String[] args) {

        Node n1 = new Node(5);
        Node head = n1;
        insertnode(10,head);
        insertnode(15,head);
        insertnode(40,head);

        Node nn1 = new Node(2);
        Node head2 = nn1;

        insertnode(3,head2);
        insertnode(20,head2);

        printnode(head);
        printnode(head2);

//        detectLoop(head);
        System.out.println(getNthFromLast(head, 10));


        Node t4 = mergeTwoLists(head, head2);
        while (t4 != null){
            System.out.println(t4.val);
            t4 = t4.next;
        }
//        System.out.println(getMiddle(head));

//        System.out.println(isPalindrome(head));
//
//        System.out.println(reverse(head));
//
//        insertnode(7,head);
//        insertnode(1,head);
//        insertnode(6,head);
//        insertnode(10,head);
//        insertnode(2,head);
//        insertnode(7,head);
//        insertnode(4,head);
//        insertnode(7,head);
//        insertnode(6,head);
//
//
//        Node temp = removeDuplicates(head);
//
//        head.next = null;
//
//
//        insertnode(7,head);
//        insertnode(2,head);
//        insertnode(3,head);
//
//        Node temp2 = removeDuplicatesunsorted(head);
//
//        head.next = null;
//
//        insertnode(5,head);
//        insertnode(6,head);
//        Node newNode = addOne(head);
//
//
//        head.next = null;
//
//        insertnode(1,head);
//        insertnode(2,head);
//        insertnode(2,head);
//        insertnode(4,head);
//        insertnode(5,head);
//        insertnode(6,head);
//        insertnode(7,head);
//
//        Node rev = reversespecific(head, 4);
//
//        insertnode(1,head);
//        insertnode(3,head);
//        insertnode(5,head);
//
//        Node del = deleteNode(head, 2);
    }

    private static Node deleteNode(Node head, int i) {
        if (head.next == null){
            return head;
        }
        if (head.val == i){
            return head.next;
        }

        Node first = head;
        Node sec = head.next;
        int count = 1;

        while (sec != null){
            if (count == i){
                first.next = first.next.next;
                sec = sec.next;
            }else {
                sec = sec.next;
                first = first.next;
            }
            count++;
        }
        return head;
    }

    private static Node reversespecific(Node head, int i) {
        if (head.next == null){
            return head;
        }
        int count = 0;
        Node temp = head.next;
        Node prev = head;
        Node nxt = temp.next;
        head.next = null;

        while (count != i - 1){
            temp.next = prev;
            prev = temp;
            temp = nxt;
            nxt = nxt.next;
            count++;
        }
        temp.next = prev;
        prev.next = nxt;
        return temp.next;
    }


    private static Node addOne(Node head) {
        if (head.next == null) {
            head.val += 1;
            return head;
        }

        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                temp.val += 1;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node removeDuplicatesunsorted(Node head) {
        if (head.next == null){
            return head;
        }

        HashSet<Integer> al = new HashSet<>();
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (al.contains(temp.val)){
                prev.next = prev.next.next;
            }else {
                al.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node removeDuplicates(Node head) {
        if (head.next == null){
            return head;
        }

        Node first = head;
        Node sec = head.next;

        while (first.next != null){
            if (first.val == sec.val){
                first.next = first.next.next;
                sec = sec.next;
            }else {
                first = first.next;
                sec = sec.next;
            }
        }
        return head;
    }

    private static Node reverse(Node head) {

        if (head.next == null){
            return head;
        }

        Node temp = head.next;
        Node prev = head;
        Node nxt = temp.next;
        head.next = null;

        while (nxt != null){
            temp.next = prev;
            prev = temp;
            temp = nxt;
            nxt = nxt.next;
        }
        temp.next = prev;
        return temp;
    }

    private static boolean isPalindrome(Node head) {
        if (head.next == null){
            return true;
        }

        Node temp = head.next;
        Node first = head;
        Node prev = head;
        Node nxt = temp.next;
        head.next = null;

        while (nxt != null){
            temp.next = prev;
            prev = temp;
            temp = nxt;
            nxt = nxt.next;
        }
        temp.next = prev;
        while (first != null){
            if (temp.val != first.val){
                return false;
            }
            temp = temp.next;
            first = first.next;
        }
        return true;
    }

    private static int getMiddle(Node head) {
//        Node temp = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    private static int getNthFromLast(Node head, int i) {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int diff = count - i;
        if (diff < 0){
            return -1;
        }
        Node temp2 = head;
        while (diff != 0){
            diff--;
            temp2 = temp2.next;
        }
        return temp2.val;
    }


//    private static boolean detectLoop(Node head) {
//        Node temp = head;
//        int count = 0;
//        while (temp != null){
//            count++;
//            temp = temp.next;
//        }
//
////        if()
//    }

    private static Node mergeTwoLists(Node head, Node head2) {
        if(head == null && head2 == null) return null;

        if (head == null) return head;
        if (head2 == null) return head2;

        Node temp1 = head;
        Node temp2 = head2;
        Node temp3 = head;

        while(temp1 != null && temp2 != null) {
            System.out.print(temp1.val + " " + temp2.val + " " + temp3.val);
            if (temp1.val <= temp2.val) {
                if (temp1 == head){
                    temp3 = temp3.next;
                }else {
                    temp3.next = temp1;
                }
                temp1 = temp1.next;
            } else {
                if (temp1 == temp3){
                    temp3 = temp3.next;
                }else {
                    temp3.next = temp2;
                }
                temp2 = temp2.next;
            }
        }
        while (temp1 != null){
            temp3.next = temp1;
            temp1 = temp1.next;
        }
        while (temp2 != null){
            temp3.next = temp2;
            temp2 = temp2.next;
        }
        return head;
    }

    private static Node inserts(Node temp, Node heads) {
        if(heads == null){
            heads = temp;
            return heads;
        }

        Node ex1 = heads;
        while(ex1.next != null){
            ex1 = ex1.next;
        }
        ex1.next = temp;
        return heads;
    }


    private static void reversell(Node head) {
        Stack<Integer> sk = new Stack<>();
        LinkedList<Integer> ll = new LinkedList<>();
        int[] nums  ={1,2,43,3};
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }

        System.out.println(al);

        Node temp = head;
        Node reverse = head;
        while (temp != null){
            sk.push(temp.val);
            temp = temp.next;
        }

        while (reverse != null){
            reverse.val = sk.pop();
            reverse = reverse.next;
        }
    }

    private static void deletenode(int val,Node head) {
        if (head == null){
            return;
        }

        Node temp = head;
        Node last = temp.next;
        Node slast = temp;

        while (last.next != null){
            last = last.next;
            slast = slast.next;
        }
        slast.next = slast.next.next;
    }

    private static void printnode(Node head) {
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

    private static void insertnode(int val,Node head) {
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
