class Solution {
    public int[] findErrorNums(int[] nums) {
        // 1, 2, 2, 4
        // 0, 1, 2, 0, 1
        int[] freq = new int[nums.length + 1];
        int duplicate = -1, missing = -1;
        for(int i : nums) {
            freq[i]++;
        }
        for(int i = 1; i < freq.length; i++) {
            if(freq[i] == 2) {
                duplicate = i;
            } else if(freq[i] == 0) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}