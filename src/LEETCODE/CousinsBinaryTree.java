package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        boolean xFound = false, yFound = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                TreeNode temp = queue.poll();
                if (temp.left != null && temp.right != null) {
                    if ((temp.left.val == x && temp.right.val == y)
                            || (temp.left.val == y && temp.right.val == x)) return false;
                }
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                if (temp.val == x) xFound = true;
                if (temp.val == y) yFound = true;
                size--;
            }
            if (xFound && yFound) return true;
            if (xFound && !yFound) return false;
            if (!xFound && yFound) return false;

        }
        return false;
    }

}
