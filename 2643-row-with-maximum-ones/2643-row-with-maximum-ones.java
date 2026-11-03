class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] onesCount = new int[mat.length];
        int maxInd = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                onesCount[i] += mat[i][j];
                maxInd = (onesCount[i] > onesCount[maxInd]) ? i : maxInd;
            }
        }
        return new int[]{maxInd, onesCount[maxInd]};
    }
}