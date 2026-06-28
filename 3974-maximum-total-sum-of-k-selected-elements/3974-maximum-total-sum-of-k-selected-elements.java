class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        for(int i = 0; i < k; i++) {
            long currMul = Math.max(1L, (long) mul - i);
            totalSum += (long) nums[nums.length - 1 - i] * currMul;
        }
        return totalSum;
    }
}