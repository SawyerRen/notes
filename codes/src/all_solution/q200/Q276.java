package all_solution.q200;

public class Q276 {
    public int numWays(int n, int k) {
        if (n == 1) return k;
        if (n == 2) return k * k;
        int[] dp = new int[n + 1];
        dp[1] = k;
        dp[2] = k * k;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = (k - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }
}
