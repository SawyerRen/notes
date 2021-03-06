package all_solution.q800;

import java.util.Stack;

public class Q856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else if (c == ')') {
                score = stack.pop() + Math.max(1, 2 * score);
            }
        }
        return score;
    }
}
