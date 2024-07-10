package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodesTree {

    public int countNodes(TreeNode root) {

        if (root == null) return 0;
        return 1+ countNodes(root.left) + countNodes(root.right);

    }

    // second solution
    public int countNodes2(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        if(root != null) queue.add(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            count++;
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return  count;
    }

}
