class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            int leftSum = findSum(nums, 0, i - 1);
            int rightSum = findSum(nums, i + 1, n - 1);
            res[i] = Math.abs(leftSum - rightSum);
        }
        return res;
    }
    private int findSum(int[] nums, int m, int n) {
        int sum = 0;
        for(int i = m; i <= n; i++) {
            sum += nums[i];
        }
        return sum;
    }
}