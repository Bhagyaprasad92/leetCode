class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        recursion(nums, res, 0);
        return res;
    }
    public void recursion(int[] nums, int[] res, int i) {
        if(i == nums.length) {
            return;
        }
        res[i] = nums[nums[i]];
        recursion(nums, res, i + 1);
    }
}