package all_solution;

public class Q13 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> res += res >= 5 ? -1 : 1;
                case 'V' -> res += 5;
                case 'X' -> res += res >= 50 ? -10 : 10;
                case 'L' -> res += 50;
                case 'C' -> res += res >= 500 ? -100 : 100;
                case 'D' -> res += 500;
                case 'M' -> res += 1000;
            }
        }
        return res;
    }
}
