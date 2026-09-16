class Solution {
    public int strStr(String a, String b) {
        int res = -1;
        int i = 0, j = 0;
        while(i < a.length() && j < b.length()) {
            if(a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return (j == b.length())?i-j:-1;
    }
}