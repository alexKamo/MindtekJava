package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftTree {

    public int sumOfLeftLeaves(TreeNode root) {

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    if (temp.left.left == null && temp.left.right == null) sum += temp.left.val;
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
                size--;
            }
        }
        return sum;
    }

}
