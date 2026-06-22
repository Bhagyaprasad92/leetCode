class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        // Map<Character, Integer> cfreq = new HashMap<>();
        int[] cfreq = new int[26];
        for(char c : chars.toCharArray()) {
            // cfreq.put(c, cfreq.getOrDefault(c, 0)+1);
            cfreq[c - 'a']++;
        }
        for(int i = 0; i < words.length; i++) {
            // Map<Character, Integer> wfreq = new HashMap<>();
            int[] wfreq = new int[26];
            for(char c : words[i].toCharArray()) {
                // wfreq.put(c, wfreq.getOrDefault(c, 0)+1);
                wfreq[c - 'a']++;
            }
            boolean isValid = true;
            for(int j = 0; j < 26; j++) {
                if(wfreq[j] > cfreq[j]) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                totalLength += words[i].length();
            }
        }
        return totalLength;
    }
}