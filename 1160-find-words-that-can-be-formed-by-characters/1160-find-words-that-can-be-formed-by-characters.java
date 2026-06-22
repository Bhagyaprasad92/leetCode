class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        Map<Character, Integer> cfreq = new HashMap<>();
        for(char c : chars.toCharArray()) {
            cfreq.put(c, cfreq.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i < words.length; i++) {
            Map<Character, Integer> wfreq = new HashMap<>();
            for(char c : words[i].toCharArray()) {
                wfreq.put(c, wfreq.getOrDefault(c, 0)+1);
            }
            //checking
            boolean isValid = true;
            for(char c : wfreq.keySet()) {
                if(wfreq.get(c) > cfreq.getOrDefault(c, 0)) {
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