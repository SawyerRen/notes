package company.fbr4.q200;

public class Q278 {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return true;
    }
}