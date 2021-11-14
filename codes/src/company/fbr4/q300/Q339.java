package company.fbr4.q300;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q339 {
    interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value);

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni);

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public int depthSum(List<NestedInteger> nestedList) {
        return helper(nestedList, 1);
    }

    private int helper(List<NestedInteger> nestedList, int level) {
        int res = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                res += level * nestedInteger.getInteger();
            } else {
                res += helper(nestedInteger.getList(), level + 1);
            }
        }
        return res;
    }

    public int depthSum1(List<NestedInteger> nestedList) {
        int level = 1;
        Queue<NestedInteger> queue = new LinkedList<>(nestedList);
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                NestedInteger poll = queue.poll();
                if (poll.isInteger()) {
                    res += level * poll.getInteger();
                } else {
                    queue.addAll(poll.getList());
                }
            }
            level++;
        }
        return res;
    }
}