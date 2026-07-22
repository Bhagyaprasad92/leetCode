class Solution {
    public boolean canReach(int[] start, int[] target) {
        boolean res = false;
        if((start[0] + start[1]) % 2 == (target[0] + target[1]) % 2) {
            res = true;
        }
        return res;
    }
}