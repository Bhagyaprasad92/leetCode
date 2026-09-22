class Solution {
    public int subarraySum(int[] nums) {
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        int res = 0;
        for(int i = 1; i < nums.length; i++) {
            ps[i] = nums[i] + ps[i - 1];
        }
        for(int i = 0; i < nums.length; i++) {
            res += ps[i];
            if(i - nums[i] > 0) res -= ps[i - nums[i] - 1];
        }
        return res;
    }
}