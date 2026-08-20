class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int k = nums.length - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while(i < j) {
                if((nums[i] + nums[j]) > nums[k]) {
                    res += (j - i);
                    j--;
                } else i++;
            }
        }
        return res;
    }
}