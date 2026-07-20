class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int total = n * m;
        k %= total;
        while (k-- > 0) {
            int last = grid[n - 1][m - 1];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if(j == 0 && i > 0) {
                        grid[i][j] = grid[i - 1][m - 1];
                    } else if(j > 0) {
                        grid[i][j] = grid[i][j - 1];
                    }
                }
            }
            grid[0][0] = last;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int[] row : grid) {
            List<Integer> innerList = new ArrayList<>();
            for(int val : row) {
                innerList.add(val);
            }
            res.add(innerList);
        }
        return res;
    }
}