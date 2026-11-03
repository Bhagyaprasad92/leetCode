class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int bestInd = 0, currCount = 0, prevCount = 0;
        for(int i = 0; i < mat.length; i++) {
            currCount = countOnes(mat[i]);
            if(currCount > prevCount) {
                bestInd = i;
            }
            prevCount = Math.max(prevCount, currCount);
        }
        return new int[]{bestInd, countOnes(mat[bestInd])};
    }
    public int countOnes(int[] arr) {
        int res = 0;
        for(int i : arr) {
            if(i == 1) res++;
        }
        return res;
    }
}