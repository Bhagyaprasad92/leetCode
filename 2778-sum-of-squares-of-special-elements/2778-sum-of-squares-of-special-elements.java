class Solution {
    public int sumOfSquares(int[] nums) {
        int resSum = 0, n = nums.length;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                resSum += nums[i - 1] * nums[i - 1];
            }
        }
        return resSum;
    }
}