package trees;

public class Tree {

    public static void main(String[] args) {

        /*
         Tree:
            non liner data structure for Hierarchical storage

            Terminology:
            Parent Node: predecessor of a node
            Child Node: successor of a node
            Root Node: the topmost node
            Lear Node: Nodes with no children
            Sibling: children nodes of the same parent node
            Level of node: count of edges from root to specific node
            Subtree: node of the tree with its descendants
         */

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

    }

}
