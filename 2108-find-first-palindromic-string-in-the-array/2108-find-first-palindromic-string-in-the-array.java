class Solution {
    public boolean isPalindrome(String s) {
        boolean res = true;
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                res = false;
            }
            i++;
            j--;
        }
        return res;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])) return words[i];
        }
        return "";
    }
}