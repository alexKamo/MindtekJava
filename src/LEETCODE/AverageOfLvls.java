package LEETCODE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLvls {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        levelOrderTraversal(root, list);
        return list;
    }

    private void levelOrderTraversal(TreeNode root, List<Double> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int amount = size;
            double av = 0;
            double sum = 0;
            while (size>0){
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                size--;
            }
            av = sum/amount;
            list.add(av);
        }
    }
}
