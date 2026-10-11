class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '*') {
                left++;
            } else {
                left--;
            }
            char c2 = s.charAt(s.length() - 1 - i);
            if(c2 == ')' || c2 == '*') {
                right++;
            } else {
                right--;
            }
            if(left < 0 || right < 0) {
                return false;
            }
        }
        return true;
    }
}