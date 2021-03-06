package company.fbr3;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res, int depth) {
        if (root == null) return;
        if (res.size() == depth) {
            res.add(root.val);
        }
        helper(root.right, res, depth + 1);
        helper(root.left, res, depth + 1);
    }
}
