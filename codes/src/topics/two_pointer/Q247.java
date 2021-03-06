package topics.two_pointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q247 {
    public List<String> findStrobogrammatic(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        helper(res, map, new char[n], 0, n - 1);
        return res;
    }

    private void helper(List<String> res, Map<Character, Character> map, char[] chars, int left, int right) {
        if (right < left) {
            res.add(new String(chars));
            return;
        }
        for (Character key : map.keySet()) {
            if (left == 0 && key == '0') continue;
            if (left == right && (key == '6' || key == '9')) continue;
            chars[left] = key;
            chars[right] = map.get(key);
            helper(res, map, chars, left + 1, right - 1);
        }
    }
}
