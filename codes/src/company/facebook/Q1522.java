package company.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q1522 {
    class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    int res = 0;

    public int diameter(Node root) {
        helper(root);
        return res;
    }

    private int helper(Node root) {
        if (root == null) return 0;
        int max1 = 0, max2 = 0;
        for (Node child : root.children) {
            int depth = helper(child) + 1;
            if (depth > max1) {
                max2 = max1;
                max1 = depth;
            } else if (depth > max2) {
                max2 = depth;
            }
        }
        res = Math.max(res, max1 + max2);
        return max1;
    }
}