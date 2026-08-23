class Solution {
    public String reversePrefix(String s, int k) {
        int i = 0, j = k - 1;
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()) {
            str.append(c);
        }
        while(i <= j) {
            char c = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, c);
            i++;
            j--;
        }
        return str.toString();
    }
}