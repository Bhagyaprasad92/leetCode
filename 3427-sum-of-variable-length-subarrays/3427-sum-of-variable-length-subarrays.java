class Solution {
    public int subarraySum(int[] nums) {
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        int res = ps[0];
        for(int i = 1; i < nums.length; i++) {
            ps[i] = nums[i] + ps[i - 1];
            int start = Math.max(0, i - nums[i]);
            for(int j = start; j <= i; j++) {
                res += nums[j];
            }
        }
        return res;
    }
}