package trees;

public class BinaryTreeTraversal {

    /*

    Traversal:
        1. Depth first Search (DFS) : preorder (curr - left - right), inorder (left,current,right), postorder (left, right,current)
        2. Breadth first search (BFS) level order from left to right

     */

    public static void main(String[] args) {

        Node root = new Node(5);
        Node n1 = new Node(6);
        Node n2 = new Node(7);
        Node n3 = new Node(8);
        Node n4 = new Node(9);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n2.right = n4;

    }

    public static void preOrder(Node root){
        if (root == null) return;
        System.out.println(root.val + "");
        preOrder(root.left);
        preOrder(root.right);
    }
}
