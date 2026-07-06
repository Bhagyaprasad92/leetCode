class Solution {
    public int divisibleGame(int[] nums) {
Set<Integer> cand = new HashSet<>();
        cand.add(2);
        for(int x : nums) {
            int temp = x;
            for(int d = 2; d * d <= temp; d++) {
                if(temp % d == 0) {
                    cand.add(d);
                    while(temp % d == 0) {
                        temp /= d;
                    }
                }
            }
            if(temp > 1) {
                cand.add(temp);
            }
        }
        
        long maxDiff = Long.MIN_VALUE;
        int bestk = -1;
        
        for (int k : cand) {
            long currSum = 0;
            long currMax = Long.MIN_VALUE;
            for (int num : nums) {
                long score = (num % k == 0) ? num : -num;
                currSum += score;
                
                if (currSum > currMax) {
                    currMax = currSum;
                }
                if (currSum < 0) {
                    currSum = 0;
                }
            }
            if (currMax > maxDiff) {
                maxDiff = currMax;
                bestk = k;
            } else if (currMax == maxDiff) {
                if (bestk == -1 || k < bestk) {
                    bestk = k;
                }
            }
        }
        
        long mod = 1000000007;
        long ans = (maxDiff % mod * bestk % mod) % mod;
        if (ans < 0) {
            ans += mod;
        }
        
        return (int) ans;
    }
}