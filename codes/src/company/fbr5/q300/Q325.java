package company.fbr5.q300;

import java.util.HashMap;
import java.util.Map;

public class Q325 {
    public int maxSubArrayLen(int[] nums, int k) {
        int res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res = Math.max(res, i - map.get(sum - k));
            }
            map.putIfAbsent(sum, i);
        }
        return res;
    }
}
