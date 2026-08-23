class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for (char c : word.toCharArray()) {
            if (c == ch) {
                return reverse(word, index);
            }
            index++;
        }
        return word;
    }

    private String reverse(String word, int k) {
        int i = 0, j = k;
        StringBuilder res = new StringBuilder();
        for (char c : word.toCharArray()) {
            res.append(c);
        }
        while (i <= j) {
            char c = res.charAt(i);
            res.setCharAt(i, res.charAt(j));
            res.setCharAt(j, c);
            i++;
            j--;
        }
        return res.toString();
    }
}