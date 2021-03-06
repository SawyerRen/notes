package company.fbfinal;

public class Q125 {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int i = 0, j = s1.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i < j) {
                if (s1.charAt(i) != s1.charAt(j)) return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
