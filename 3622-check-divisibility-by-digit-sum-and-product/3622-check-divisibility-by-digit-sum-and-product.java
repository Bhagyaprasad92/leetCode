class Solution {
    public boolean checkDivisibility(int n) {
        int ds = 0, dp = 1;
        int t = n;
        while (t > 0) {
            int d = t % 10;
            ds += d;
            dp *= d;
            t /= 10;
        }
        return n % (ds + dp) == 0;
    }
}