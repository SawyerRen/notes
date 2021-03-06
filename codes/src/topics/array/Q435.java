package topics.array;

import java.util.Arrays;
import java.util.Comparator;

public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int curEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (curEnd <= intervals[i][0]) {
                count++;
                curEnd = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}
