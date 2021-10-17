package company.facebook;

public class Q424 {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int res = 0;
        int[] count = new int[26];
        int maxCount = 0;
        while (j < s.length()) {
            count[s.charAt(j) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(j) - 'A']);
            while (j - i + 1 - maxCount > k) {
                count[s.charAt(i) - 'A']--;
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}