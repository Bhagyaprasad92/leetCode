class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder xB = new StringBuilder();
        StringBuilder yB = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c == y) {
                yB.append(c);
            } else if(c == x) {
                xB.append(c);
            } else {
                others.append(c);
            }
        }
        return yB.toString() + others.toString() + xB.toString();
    }
}