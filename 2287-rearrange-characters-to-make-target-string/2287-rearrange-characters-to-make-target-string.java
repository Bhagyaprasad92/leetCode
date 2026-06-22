class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        int[] sfreq = new int[26];
        for(char c : s.toCharArray()) {
            sfreq[c - 'a']++;
        }
        int[] tfreq = new int[26];
        for(char c : target.toCharArray()) {
            tfreq[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(tfreq[i] > 0) {
                ans = Math.min(ans, sfreq[i] / tfreq[i]);
            }
        }
        return ans;
    }
}