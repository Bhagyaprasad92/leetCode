class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int[] freq = new int[max + 1];
        int sum = 0;
        for(int i : nums) {
            if(i % 2 == 0){
                freq[i]++;
                sum += freq[i];
            } 
        }
        if(sum == 0) return -1;
        int maxFreq = -1, res = -1;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                res = i;
            }
        }
        return res;
    }
}