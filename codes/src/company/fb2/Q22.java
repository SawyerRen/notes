package company.fb2;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private void helper(List<String> res, StringBuilder builder, int left, int right, int n) {
        if (left == n && right == n) {
            res.add(builder.toString());
        }
        int len = builder.length();
        if (left < n) {
            builder.append("(");
            helper(res, builder, left + 1, right, n);
            builder.setLength(len);
        }
        if (left > right) {
            builder.append(")");
            helper(res, builder, left, right + 1, n);
            builder.setLength(len);
        }
    }
}
