class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            res += binarySearch(grid[i], 0);
        }
        return res;
    }
    private int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return nums.length - low;
    }
}