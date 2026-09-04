class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 1) return 0;
        int res = -1;
        for(int i = 0; i < nums.length; i++) {
            int max = findMax(nums, 0, i);
            int min = findMin(nums, i, nums.length);
            int currScore = max - min;
            if(currScore <= k) {
                res = i;
                break;
            }
        }
        return res;
    }
    private int findMax(int[] nums, int m, int n) {
        int max = Integer.MIN_VALUE;
        for(int i = m; i <= n; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
    private int findMin(int[] nums, int m, int n) {
        int min = Integer.MAX_VALUE;
        for(int i = m; i < n; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}