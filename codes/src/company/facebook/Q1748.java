package company.facebook;

import java.util.HashMap;
import java.util.Map;

public class Q1748 {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) sum += i;
        }
        return sum;
    }
}
