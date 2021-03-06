package company.fbr4.again;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q247 {
    public List<String> findStrobogrammatic(int n) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('6', '9');
        map.put('0', '0');
        map.put('9', '6');
        map.put('8', '8');
        List<String> res = new ArrayList<>();
        helper(res, map, 0, n - 1, new char[n]);
        return res;
    }

    private void helper(List<String> res, Map<Character, Character> map, int left, int right, char[] chars) {
        if (left > right) {
            res.add(new String(chars));
            return;
        }
        for (Character c1 : map.keySet()) {
            if (left == right && (c1 == '9' || c1 == '6')) continue;
            if (left == 0 && left < right && c1 == '0') continue;
            chars[left] = c1;
            chars[right] = map.get(c1);
            helper(res, map, left + 1, right - 1, chars);
        }
    }
}
