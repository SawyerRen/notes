package company.pimco;

import java.util.Stack;

// valid parentheses in array
public class Q4 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                switch (c) {
                    case ')' -> {
                        if (stack.peek() != '(') return false;
                        stack.pop();
                    }
                    case ']' -> {
                        if (stack.peek() != '[') return false;
                        stack.pop();
                    }
                    case '}' -> {
                        if (stack.peek() != '{') return false;
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
