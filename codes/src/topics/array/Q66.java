package topics.array;

public class Q66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] res = new int[len + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
