package all_solution.q200;

import java.util.ArrayList;
import java.util.List;

public class Q254 {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), n, 2);
        return res;
    }

    private void helper(List<List<Integer>> res, ArrayList<Integer> list, int n, int factor) {
        if (n == 1) {
            if (list.size() > 1) res.add(new ArrayList<>(list));
            return;
        }
        for (int i = factor; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                helper(res, list, n / i, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
