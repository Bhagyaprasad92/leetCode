class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int reverseOfN = 0;
        while(temp > 0) {
            reverseOfN = reverseOfN * 10 + temp % 10;
            temp /= 10; 
        }
        return (int)Math.abs(n - reverseOfN);
    }
}