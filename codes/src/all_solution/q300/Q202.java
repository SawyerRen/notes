package all_solution.q300;

import java.util.HashSet;
import java.util.Set;

public class Q202 {
    Set<Integer> visited = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;
        int num = 0;
        while (n != 0) {
            int tail = n % 10;
            num += tail * tail;
            n /= 10;
        }
        if (visited.contains(num)) return false;
        visited.add(num);
        return isHappy(num);
    }
}
