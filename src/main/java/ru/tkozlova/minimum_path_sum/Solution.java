package ru.tkozlova.minimum_path_sum;

public class Solution {

    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] calculatedPaths = new int[2][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t = i == 0 ? Integer.MAX_VALUE : calculatedPaths[0][j];
                int l = j == 0 ? Integer.MAX_VALUE : calculatedPaths[1][j - 1];

                int min = Math.min(t, l);
                min = min == Integer.MAX_VALUE ? 0 : min;

                calculatedPaths[1][j] = min + grid[i][j];
            }

            for (int j = 0; j < m; j++) {
                calculatedPaths[0][j] = calculatedPaths[1][j];
                calculatedPaths[1][j] = 0;
            }
        }
        return calculatedPaths[0][m - 1];
    }
}
