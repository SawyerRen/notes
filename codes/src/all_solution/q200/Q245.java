package all_solution.q200;

public class Q245 {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int res = Integer.MAX_VALUE;
        Integer index1 = null, index2 = null;
        boolean same = word1.equals(word2);
        for (int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i])) {
                if (same) {
                    index2 = index1;
                }
                index1 = i;
            } else if (word2.equals(wordsDict[i])) {
                index2 = i;
            }
            if (index1 != null && index2 != null) {
                res = Math.min(res, Math.abs(index1 - index2));
            }
        }
        return res;
    }
}
