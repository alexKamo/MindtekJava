package LEETCODE;

import LEETCODE.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;

    }



    void inorderTraversal(TreeNode root, List<Integer> list){
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

}
