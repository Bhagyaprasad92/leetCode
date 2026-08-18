class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        if(first == -1) return new int[]{-1, -1};
        int last = binarySearch(nums, target, false);
        return new int[]{first, last};
    }
    private int binarySearch(int[] nums, int target, boolean isFirst) {
        int res = -1, low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                res = mid;
                if(isFirst) high = mid - 1;
                else low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return res;
    }
}