class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int i : nums)
            totalSum += i;
        int leftSum = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}