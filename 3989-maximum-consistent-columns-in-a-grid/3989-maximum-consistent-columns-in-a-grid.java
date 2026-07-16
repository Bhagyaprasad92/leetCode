class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        int maxCols = 1;
        for(int v = 0; v < n; v++) {
            dp[v] = 1;
            for(int u = 0; u < v; u++) {
                if(isCompatible(grid, u, v, limit, m)) {
                    dp[v] = Math.max(dp[v], dp[u] + 1);
                }
            }
            maxCols = Math.max(maxCols, dp[v]);
        }
        return maxCols;
    }
    private boolean isCompatible(int[][] grid, int u, int v, int limit, int m) {
        for(int i = 0; i < m; i++) {
            if(Math.abs(grid[i][v] - grid[i][u]) > limit) {
                return false;
            }
        }
        return true;
    }
}