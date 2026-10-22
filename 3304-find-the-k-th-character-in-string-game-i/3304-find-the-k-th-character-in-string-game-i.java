class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder();
        word.append("a");
        char res = '\0';
        for (int i = 0; i < word.length(); i++) {
            if (word.length() < k) {
                StringBuilder generated = new StringBuilder();
                for(int j = 0; j < word.length(); j++) {
                    int curr = word.charAt(j) + ('1' - '0');
                    generated.append((char) curr);
                }
                word.append(generated);
            } else {
                res = word.charAt(k - 1);
                break;
            }
        }
        return res;
    }
}