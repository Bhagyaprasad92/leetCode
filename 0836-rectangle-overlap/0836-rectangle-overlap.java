class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int L = Math.max(rec1[0], rec2[0]);
        int R = Math.min(rec1[2], rec2[2]);
        int B = Math.max(rec1[1], rec2[1]);
        int T = Math.min(rec1[3], rec2[3]);
        return (L < R) && (B < T);
    }
}