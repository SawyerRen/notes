package all_solution.q900;

public class Q953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i], s2 = words[i + 1];
            if (!valid(index, s1, s2)) return false;
        }
        return true;
    }

    private boolean valid(int[] index, String s1, String s2) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) return index[c1 - 'a'] < index[c2 - 'a'];
        }
        return s1.length() <= s2.length();
    }
}
