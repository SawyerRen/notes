package all_solution.q100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), nums, 0, new boolean[nums.length]);
        return res;
    }

    private void helper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int start, boolean[] visited) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            visited[i] = true;
            list.add(nums[i]);
            helper(res, list, nums, i + 1, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
