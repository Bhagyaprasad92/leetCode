class Solution {
    public boolean canAliceWin(int n) {
        int take = 10;
        boolean res = true;
        while(n >= take) {
            n -= take;
            take--;
            res = !res;
        }
        return !res;
    }
}