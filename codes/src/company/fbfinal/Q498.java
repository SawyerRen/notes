package company.fbfinal;

public class Q498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int i = 0, j = 0, d = 0;
        int[][] dirs = {{-1, 1}, {1, -1}};
        for (int k = 0; k < m * n; k++) {
            res[k] = mat[i][j];
            i += dirs[d][0];
            j += dirs[d][1];
            if (i >= m) {
                i = m - 1;
                j += 2;
                d = 1 - d;
            } else if (j >= n) {
                j = n - 1;
                i += 2;
                d = 1 - d;
            } else if (i < 0) {
                i = 0;
                d = 1 - d;
            } else if (j < 0) {
                j = 0;
                d = 1 - d;
            }
        }
        return res;
    }
}
