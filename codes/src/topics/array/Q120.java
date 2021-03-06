package topics.array;

import java.util.List;

public class Q120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size];
        for (int i = 0; i < triangle.get(size - 1).size(); i++) {
            dp[i] = triangle.get(size - 1).get(i);
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
