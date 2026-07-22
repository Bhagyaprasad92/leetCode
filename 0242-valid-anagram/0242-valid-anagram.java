class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }
        for (char key : smap.keySet()) {
            if (!smap.get(key).equals(tmap.get(key)))
                return false;

            if ((int) smap.get(key) != (int) tmap.get(key))
                return false;
        }
        return true;
    }
}