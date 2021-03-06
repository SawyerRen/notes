package company.facebook;

public class Q240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = m - 1, j = 0;
        while (i >= 0 && j < n) {
            if (target == matrix[i][j]) return true;
            if (matrix[i][j] < target) j++;
            else i--;
        }
        return false;
    }
}
