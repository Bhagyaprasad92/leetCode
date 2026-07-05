class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums) {
            freq[i]++;
        }
        if(freq[nums[nums.length/2]] > 1) {
            return false;
        }
        return true;
    }
}