class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return gcd(min, max);
    }
    private int gcd(int min, int max) {
        return (max == 0) ? min : gcd(max, min % max);
    }
}