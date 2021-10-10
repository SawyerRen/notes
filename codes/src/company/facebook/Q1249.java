package company.facebook;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Q1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> invalidIndex = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')'){
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    invalidIndex.add(i);
                }
            }
        }
        while (!stack.isEmpty()) {
            invalidIndex.add(stack.pop());
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (invalidIndex.contains(i)) continue;
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
