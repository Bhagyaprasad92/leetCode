class Solution {
    private int GCD(int min, int max) {
        while(max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
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