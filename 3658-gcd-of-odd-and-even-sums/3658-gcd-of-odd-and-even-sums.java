class Solution {
    private static int findGCD(int oddSum, int evenSum) {
        if(evenSum == 0) {
            return Math.abs(oddSum);
        }
        return findGCD(evenSum, oddSum % evenSum);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n * n;
        int evenSum = n * (n + 1);
        return findGCD(oddSum, evenSum);
    }
}