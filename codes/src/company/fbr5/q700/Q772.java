package company.fbr5.q700;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q772 {
    public int calculate(String s) {
        if (s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (char c : chars) {
            queue.add(c);
        }
        queue.add('+');
        return helper(queue);
    }

    private int helper(Queue<Character> queue) {
        if (queue.size() == 0) return 0;
        int num = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            Character c = queue.poll();
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                num = helper(queue);
            } else {
                switch (sign) {
                    case '+' -> stack.push(num);
                    case '-' -> stack.push(-num);
                    case '*' -> stack.push(stack.pop() * num);
                    case '/' -> stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
                if (c == ')') break;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
