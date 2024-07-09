package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class postOrderTravesal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

       postOrder(root);

        return list;

    }

    void postOrder(TreeNode root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);

    }


}
