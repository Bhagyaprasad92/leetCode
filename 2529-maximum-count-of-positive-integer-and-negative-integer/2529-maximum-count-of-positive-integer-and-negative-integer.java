class Solution {
    public int maximumCount(int[] nums) {
        int low = 0, high = nums.length - 1;
        int negCount = lowerBound(nums, 0);
        int posCount = nums.length - lowerBound(nums, 1);
        return Math.max(negCount, posCount);
    }
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return low;
    }
}