package company.fb2;

public class Q79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper(board, i, j, word, m, n, 0, new boolean[m][n])) return true;
            }
        }
        return false;
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    private boolean helper(char[][] board, int i, int j, String word, int m, int n, int index, boolean[][] visited) {
        if (index == word.length()) return true;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) return false;
        if (word.charAt(index) != board[i][j]) return false;
        visited[i][j] = true;
        for (int[] dir : dirs) {
            if (helper(board, i + dir[0], j + dir[1], word, m, n, index + 1, visited)) return true;
        }
        visited[i][j] = false;
        return false;
    }
}
