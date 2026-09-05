class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int totalSum = 0;
        for(int i : nums) totalSum += i;
        int leftSum = 0;
        for(int i = 0; i < n; i++) {
            int rightSum = totalSum - nums[i] - leftSum;
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}