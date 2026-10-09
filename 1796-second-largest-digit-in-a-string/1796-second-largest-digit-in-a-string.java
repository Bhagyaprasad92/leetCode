class Solution {
    public int secondHighest(String s) {
        int a = -1, b = -1, i = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                int d = c - '0';
                if(d > a) {
                    b = a;
                    a = d;
                } else if(d < a && d > b) {
                    b = d;
                }
            }
        }
        return b;
    }
}