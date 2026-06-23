class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        int[] stringfreq = new int[26];
        for(char c : s.toCharArray()) {
            stringfreq[c - 'a']++;
        }
        int[] targetfreq = new int[26];
        for(char c : target.toCharArray()) {
            targetfreq[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(targetfreq[i] > 0) {
                ans = Math.min(ans, stringfreq[i] / targetfreq[i]);
            }
        }
        return ans;
    }
}