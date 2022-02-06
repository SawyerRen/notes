package all_solution.q100;

import java.util.ArrayList;
import java.util.List;

public class Q163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            res.add(toStr(lower, upper));
            return res;
        }
        if (lower < nums[0]) {
            res.add(toStr(lower, nums[0] - 1));
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                res.add(toStr(nums[i] + 1, nums[i + 1] - 1));
            }
        }
        if (nums[nums.length - 1] < upper) {
            res.add(toStr(nums[nums.length - 1] + 1, upper));
        }
        return res;
    }

    private String toStr(int lower, int upper) {
        if (lower == upper) return String.valueOf(lower);
        return lower + "->" + upper;
    }
}
