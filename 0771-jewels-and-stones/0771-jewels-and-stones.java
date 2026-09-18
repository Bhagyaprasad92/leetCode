class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c : stones.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for(char c : jewels.toCharArray()) {
            res += mp.getOrDefault(c, 0);
        }
        return res;
    }
}