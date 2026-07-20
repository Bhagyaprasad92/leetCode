class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int totalKeys = m * n;
        k %= totalKeys;
        while (k-- > 0) {
            int last = grid[m - 1][n - 1];
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (j == 0 && i > 0) {
                        grid[i][j] = grid[i - 1][n - 1];
                    } else if (j > 0) {
                        grid[i][j] = grid[i][j - 1];
                    }
                }
            }
            grid[0][0] = last;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] row : grid) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int val : row) {
                innerList.add(val);
            }
            ans.add(innerList);
        }
        return ans;
    }
}