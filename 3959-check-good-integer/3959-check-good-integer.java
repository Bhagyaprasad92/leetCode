class Solution {
    public boolean checkGoodInteger(int n) {
        int dSum = 0, sSum = 1;
        while(n > 0) {
            int d = n % 10;
            dSum += d;
            sSum += (d * d);
            n /= 10;
        }
        return (sSum - dSum) >= 50;
    }
}