class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        for(int v : nums) if(v % 2 == 0) res[i++] = v;
        for(int v : nums) if(v % 2 != 0) res[i++] = v;
        return res;
    }
}