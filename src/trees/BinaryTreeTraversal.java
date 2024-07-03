package trees;

import java.util.LinkedList;
import java.util.Queue;

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
        Node n5 = new Node(10);
        Node n6 = new Node(2);


        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n5;
        n2.right = n4;
        n2.left = n6;
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
        System.out.print("BFS: ");
        levelOrderTraversal(root);
    }

    public static void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }
    public static void levelOrderTraversal(Node root){
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val + " ");
            // push left and right children
            if (temp.left != null) q.offer(temp.left);
            if (temp.right != null) q.offer(temp.right);
        }
    }
}
