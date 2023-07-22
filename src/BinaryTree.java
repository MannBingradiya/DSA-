public class BinaryTree {
    public static void main(String[] args) {
        Node rootNode = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Root Btree = new Root();

        Btree.root = rootNode;
        Btree.root.left = n2;
        Btree.root.right = n3;
        Btree.root.left.left = n4;
        Btree.root.left.right = n5;

        printTree(Btree.root);

    }

    private static void printTree(Node root) {

        if(root == null){
            return;
        }
        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);
    }

}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
class Root{
    Node root;
}