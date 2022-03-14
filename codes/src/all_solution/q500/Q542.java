package all_solution.q500;

import java.util.LinkedList;
import java.util.Queue;

public class Q542 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int[] dir : dirs) {
                int x = poll[0] + dir[0], y = poll[1] + dir[1];
                if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) continue;
                mat[x][y] = mat[poll[0]][poll[1]] + 1;
                visited[x][y] = true;
                queue.add(new int[]{x, y});
            }
        }
        return mat;
    }
}
