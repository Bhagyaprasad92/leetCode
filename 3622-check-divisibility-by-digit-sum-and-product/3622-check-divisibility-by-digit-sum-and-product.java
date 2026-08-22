class Solution {
    public boolean checkDivisibility(int n) {
        int ds = 0, dp = 1;
        String s = Integer.toString(n);
        for(char i : s.toCharArray()) {
            ds += i - '0';
            dp *= i - '0';
        }
        if(n % (ds + dp) == 0) return true;
        return false;
    }
}