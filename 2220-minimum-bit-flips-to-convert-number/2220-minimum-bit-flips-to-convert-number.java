class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        while (start > 0 || goal > 0) {
            int st = start & 1;
            int gl = goal & 1;
            if (st != gl) {
                c++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return c;
    }
}