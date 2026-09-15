class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                count++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return count;
    }
}