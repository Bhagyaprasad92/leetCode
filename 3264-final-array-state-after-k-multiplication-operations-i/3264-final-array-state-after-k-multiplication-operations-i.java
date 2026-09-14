class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        while(k-- > 0) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int i = 0; i < nums.length; i++) {
                if(min > res[i]) {
                    min = res[i];
                    minIndex = i;
                }
            }
            res[minIndex] = min * multiplier;
        }
        return res;
    }
}