class Solution {
    private static final int MOD = 1_000_000_007;

    public int countValidSequences(int n, int k) {
        if (n < k)
            return 0;

        long totalSeq = nCr(n - 1, k - 1);
        long oddProdSeq = 0;
        if ((n - k) % 2 == 0) {
            int m = (n - k) / 2;
            oddProdSeq = nCr(m + k - 1, k - 1);
        }
        long ans = (totalSeq - oddProdSeq + MOD) % MOD;
        return (int) ans;
    }

    private long nCr(int n, int r) {
        if(r < 0 || r > n) return 0;
        if(r == 0 || r == n) return 1;
        if(r > n - r) r = n - r;

        long num = 1;
        long den = 1;

        for(int i = 1; i <= r; i++) {
            num = (num * (n - i + 1)) % MOD;
            den = (den * i) % MOD;
        }
        return (num * modInv(den, MOD)) % MOD;
    }

    private long modInv(long base, int m){
        int exp = m - 2;
        long res = 1;
        base = base % m;
        while(exp > 0) {
            if((exp & 1) == 1) res = (res * base) % m;
            base = (base * base) % m;
            exp >>= 1;
        }
        return res;
    }
}