package all_solution.q400;

public class Q413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int[] dp = new int[nums.length];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int count = 0;
        for (int i : dp) {
            count += i;
        }
        return count;
    }
}
