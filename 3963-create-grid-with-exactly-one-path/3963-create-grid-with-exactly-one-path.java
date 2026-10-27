class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        StringBuilder fR = new StringBuilder();
        for(int j = 0; j < n; j++) {
            fR.append('.');
        }
        grid[0] = fR.toString();
        if(m > 1) {
            StringBuilder oR = new StringBuilder();
            for(int j = 0; j < n - 1; j++) {
                oR.append('#');
            }
            oR.append('.');
            String rowString = oR.toString();
            for(int i = 1; i < m; i++) {
                grid[i] = rowString;
            }
        }
        return grid;
    }
}