import java.util.LinkedList;
import java.util.Queue;

public class inorderTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }

    }
    static int sum = 0;

    public static void preoreder(Node root) {
        if (root == null) {
            return;
        }
        sum += root.data;
        System.out.print(root.data + " ");
        preoreder(root.left);
        preoreder(root.right);
    }

    public static void inoreder(Node root){
        if (root == null) {
            return;
        }
        inoreder(root.left);
        System.out.print(root.data + " ");
        inoreder(root.right);
    }
    public static void postoreder(Node root){
        if (root == null) {
            return;
        }
        postoreder(root.left);
        postoreder(root.right);
        System.out.print(root.data + " ");
    }
    private static void levelorder(Node root) {
        if (root == null){
            return;
        }

        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while (!qu.isEmpty()) {
            Node currNode =  qu.remove();
            if (currNode == null){
                if (qu.isEmpty()){
                    break;
                }else {
                    qu.add(null);
                }
            }else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) qu.add(currNode.left);
                if (currNode.right != null) qu.add(currNode.right);
            }
        }
    }

    private static int countNode(Node root) {
        if (root == null){
            return 0;
        }

        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);

        return leftNode + rightNode + 1;
    }

    private static int sumOfNode(Node root) {
        if (root == null){
            return 0;
        }

        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 7, -1, -1, 6, -1, -1};
        Node root = BTree.buildTree(nodes);
        preoreder(root);
        System.out.println();
        inoreder(root);
        System.out.println();
        postoreder(root);
        System.out.println();
        levelorder(root);
        System.out.println();
        System.out.println(countNode(root));
        System.out.println(sumOfNode(root));
    }
}
