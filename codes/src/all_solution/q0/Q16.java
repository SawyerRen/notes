package all_solution.q0;

import java.util.Arrays;

public class Q16 {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(res - target);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) return sum;
                else if (sum < target) {
                    if (target - sum < minDiff) {
                        minDiff = target - sum;
                        res = sum;
                    }
                    l++;
                } else {
                    if (sum - target < minDiff) {
                        minDiff = sum - target;
                        res = sum;
                    }
                    r--;
                }
            }
        }
        return res;
    }
}
