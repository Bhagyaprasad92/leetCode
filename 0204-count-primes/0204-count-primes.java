class Solution {
    public boolean[] isPrime;
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i * i < n; i++) {
            if(isPrime[i]) crossMultiples(i, n); 
        }
        int resCount = 0;
        for(boolean state : isPrime) {
            if(state) resCount++;
        }
        return resCount;
    }
    public void crossMultiples(int ind, int n) {
        int v = ind;
        for(int i = ind * ind; i < n; i+=v) {
            isPrime[i] = false;
        }
    }
}