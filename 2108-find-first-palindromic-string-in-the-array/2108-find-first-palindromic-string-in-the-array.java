class Solution {
    public boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])) return words[i];
        }
        return "";
    }
}