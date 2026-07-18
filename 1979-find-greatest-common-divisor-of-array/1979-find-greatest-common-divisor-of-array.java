class Solution {
    private int GCD(int min, int max) {
        if(max == 0) {
            return min;
        }
        return GCD(max, min % max);
    }
    public int findGCD(int[] nums) {
        int min = nums[0], max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            } else if(nums[i] > max) {
                max = nums[i];
            }
        }
        return GCD(min, max);
    }
}