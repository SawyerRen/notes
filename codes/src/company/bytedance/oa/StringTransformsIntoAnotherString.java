package company.bytedance.oa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringTransformsIntoAnotherString {
    public boolean canConvert(String str1, String str2) {
        if (str1.equals(str2)) return true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i), c2 = str2.charAt(i);
            if (map.getOrDefault(c1, c2) != c2)
                return false;
            map.put(c1, c2);
        }
        return new HashSet<>(map.values()).size() < 26;
    }
}
