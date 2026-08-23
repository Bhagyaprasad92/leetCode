class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int lastSpace = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == ' ') {
                res.append(reverse(s, lastSpace + 1, i));
                lastSpace = i;
                if(lastSpace < n - 1) res.append(" ");
            } else if(i == n - 1) {
                res.append(reverse(s, lastSpace + 1, i + 1));
            }
        }
        return res.toString();
    }
    private String reverse(String s, int i, int j) {
        StringBuilder str = new StringBuilder();
        for(int c = i; c < j; c++) {
            str.append(s.charAt(c));
        }
        return str.reverse().toString();
    }
}