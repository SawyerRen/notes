package topics.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {
}

class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        int size = queue.size();
        queue.add(x);
        for (int i = 0; i < size; i++) {
            queue.add(queue.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}