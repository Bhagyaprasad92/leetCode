class Solution {
    public int digitFrequencyScore(int n) {
        String s = String.valueOf(n);
        int max = Integer.MIN_VALUE;
        for(char c : s.toCharArray()) {
            if((c - '0') > max) max = c - '0';
        }
        int[] freq = new int[s.length() + max];
        for(char c : s.toCharArray()) {
            freq[c - '0']++;
        } 
        int res = 0;
        for(int i = 1; i < freq.length; i++) {
            res += freq[i] * i;
        }
        return res;
    }
}