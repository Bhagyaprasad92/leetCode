class Solution {
    public int minimumCost(int[] nums, int k) {
        long sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if(sum <= k) return 0;
        long m = (sum - 1) / k;
        long m1 = m;
        long m2 = m + 1;
        if(m1 % 2 == 0) {
            m1 /= 2;
        } else {
            m2 /= 2;
        }
        long mod = 1000000007;
        m1 %= mod;
        m2 %= mod;
        long cost = (m1 * m2) % mod;
        return (int) cost;
    }
}