class Solution {
    public int differenceOfSums(int n, int m) {
        int nonD = 0, D = 0;
        for(int i = 1; i <= n; i++) {
            if(i % m == 0) {
                D += i;
            } else {
                nonD += i;
            }
        }
        return nonD - D;
    }
}