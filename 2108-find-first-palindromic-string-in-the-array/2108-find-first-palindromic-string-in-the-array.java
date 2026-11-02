class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            if(new StringBuilder(words[i]).reverse().toString().equals(words[i])) return words[i];
        }
        return "";
    }
}