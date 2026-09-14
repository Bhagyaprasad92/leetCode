class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res = new int[n * 2];
        int[] temp = nums;
        int v = 1;
        for (int i = 0; i < res.length; i++) {
            if (i < n) {
                res[i] = nums[i];
            } else {
                res[i] = nums[n - v];
                v++;
            }
        }
        return res;
    }
}