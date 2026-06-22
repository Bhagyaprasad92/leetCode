class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean valid = true;
        int[] nfreq = new int[26];
        for(char c : ransomNote.toCharArray()) {
            nfreq[c - 'a']++;
        }
        int[] mfreq = new int[26];
        for(char c : magazine.toCharArray()) {
            mfreq[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(nfreq[i] > mfreq[i]) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}