package all_solution.q200;

public class Q231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        return (n & (n - 1)) == 0;
    }
}
