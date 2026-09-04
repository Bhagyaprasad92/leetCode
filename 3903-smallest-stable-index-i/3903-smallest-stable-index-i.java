class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 1) return 0;
        int res = -1;
        int[] maxPref = new int[nums.length];
        maxPref[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxPref[i] = Math.max(maxPref[i - 1], nums[i]);
        }
        int[] minPref = new int[nums.length];
        minPref[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            minPref[i] = Math.min(minPref[i + 1], nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            int currScore = maxPref[i] - minPref[i];
            if(currScore <= k) {
                res = i;
                break;
            }
        }
        return res;
    }
}