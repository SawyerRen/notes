package karat.calculator;

import java.util.Stack;

public class Q4 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0, num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = c - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
            }
            if (i == s.length() - 1 || !Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') {
                switch (sign) {
                    case '+' -> stack.push(num);
                    case '-' -> stack.push(-num);
                    case '/' -> stack.push(stack.pop() / num);
                    case '*' -> stack.push(stack.pop() * num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
