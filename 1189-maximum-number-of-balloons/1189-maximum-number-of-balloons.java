class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        int[] tfreq = new int[26];
        for(char c : text.toCharArray()) {
            tfreq[c - 'a']++;
        }
        String target = "balloon";
        int[] tarfreq = new int[26];
        for(char c : target.toCharArray()) {
            tarfreq[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(tarfreq[i] > 0) {
                ans = Math.min(ans, tfreq[i] / tarfreq[i]);
            }
        }
        return ans;
    }
}