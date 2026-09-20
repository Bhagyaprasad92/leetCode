class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 1; i <= s.length(); i++) {
            int diff = s.charAt(i - 1) - 'a';
            res += (Math.abs(diff - 26)) * i; 
        }
        return res;
    }
}