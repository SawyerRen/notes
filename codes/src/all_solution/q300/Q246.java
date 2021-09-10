package all_solution.q300;

import java.util.HashMap;
import java.util.Map;

public class Q246 {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        int i = 0, j = num.length() - 1;
        while (i <= j) {
            if (!map.containsKey(num.charAt(i)) || !map.containsKey(num.charAt(j))) return false;
            if (map.get(num.charAt(i)) != num.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
