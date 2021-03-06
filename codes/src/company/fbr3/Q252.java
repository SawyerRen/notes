package company.fbr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i + 1][0] < intervals[i][1]) return false;
        }
        return true;
    }
}
