package company.fbr4.q1100;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q1197 {
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        int res = 0;
        int[][] dirs = new int[][]{{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                if (poll[0] == x && poll[1] == y) return res;
                for (int[] dir : dirs) {
                    int row = poll[0] + dir[0], col = poll[1] + dir[1];
                    if (row < -1 || col < -1 || visited.contains(row + "," + col)) continue;
                    visited.add(row + "," + col);
                    queue.add(new int[]{row, col});
                }
            }
            res++;
        }
        return -1;
    }
}
