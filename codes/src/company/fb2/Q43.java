package company.fb2;

public class Q43 {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';
                int mul = n1 * n2;
                int sum = mul + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i : res) {
            if (i == 0 && builder.length() == 0) continue;
            else builder.append(i);
        }
        if (builder.length() == 0) return "0";
        return builder.toString();
    }
}
