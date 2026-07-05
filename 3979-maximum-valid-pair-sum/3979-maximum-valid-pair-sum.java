class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxPrefix = nums[0], maxPairSum = 0;
        for(int j = k; j < nums.length; j++) {
            maxPrefix = Math.max(maxPrefix, nums[j - k]);
            maxPairSum = Math.max(maxPairSum, maxPrefix + nums[j]);
        }
        return maxPairSum;
    }
}