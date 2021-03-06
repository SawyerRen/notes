package topics.math;

import java.util.ArrayList;
import java.util.List;

public class Q229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Integer num1 = null, num2 = null;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num1 != null && num1 == num) {
                count1++;
            } else if (num2 != null && num2 == num) {
                count2++;
            } else if (count1 == 0) {
                num1 = num;
                count1++;
            } else if (count2 == 0) {
                num2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num1 == num) count1++;
            if (num2 != null && num2 == num) count2++;
        }
        if (count1 > nums.length / 3) res.add(num1);
        if (count2 > nums.length / 3) res.add(num2);
        return res;
    }
}
