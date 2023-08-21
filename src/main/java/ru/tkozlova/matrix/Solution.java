package ru.tkozlova.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[][] updateMatrix(int[][] mat) {

        Queue<int[]> queue = new LinkedList();
        var n = mat.length;
        var m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] = Integer.MAX_VALUE;
                } else {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        while (!queue.isEmpty()) {

            var cell = queue.poll();
            for (var d : directions) {
                var r = cell[0] + d[0];
                var c = cell[1] + d[1];

                if (r >= 0 && r < n && c >= 0 && c < m && mat[cell[0]][cell[1]] + 1 < mat[r][c]) {
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                    queue.add(new int[] {r, c});
                }
            }
        }

        return mat;
    }
}
