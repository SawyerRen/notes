package company.fbr3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Integer num : map.keySet()) {
            Integer count = map.get(num);
            if (buckets[count] == null) buckets[count] = new ArrayList<>();
            buckets[count].add(num);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = nums.length; i >= 0; i--) {
            if (buckets[i] != null) {
                List<Integer> list = buckets[i];
                for (Integer v : list) {
                    res[index++] = v;
                }
                k -= list.size();
                if (k == 0) break;
            }
        }
        return res;
    }
}
