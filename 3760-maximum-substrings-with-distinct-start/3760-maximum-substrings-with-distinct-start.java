class Solution {
    public int maxDistinct(String s) {
        int resCount = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for(char c : mp.keySet()) {
            if(mp.get(c)!=0) {
                resCount++;
            }
        }
        return resCount;
    }
}