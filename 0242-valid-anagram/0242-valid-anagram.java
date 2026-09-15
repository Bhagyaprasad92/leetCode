class Solution {
    public boolean isAnagram(String s, String t) {
        int[] seen = new int[26];
        for(char c : s.toCharArray()) {
            seen[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            seen[c - 'a']--;
        }
        for(int i : seen) {
            if(i != 0) return false;
        }
        return true;
    }
}