class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        int mask = 0x55555555;
        return ((n & (n - 1)) == 0) && (n & (mask)) != 0;
    }
}