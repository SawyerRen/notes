package company.facebook;

public class Q273 {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (num != 0) {
            if (num % 1000 != 0) {
                res.insert(0, helper(num % 1000) + THOUSANDS[i] + " ");
            }
            i++;
            num /= 1000;
        }
        return res.toString().trim();
    }

    private String helper(int num) {
        if (num == 0) return "";
        if (num < 20) return LESS_THAN_20[num] + " ";
        if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
}
