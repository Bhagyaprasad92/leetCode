class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;
        for(int num : nums) {
            int curr = getDigitRange(num);
            if(curr > maxRange) {
                maxRange = curr;
                sum = num;
            } else if(curr == maxRange) {
                sum += num;
            }
        }
        return sum;
    }
    private int getDigitRange(int num) {
        int max = -1;
        int min = 10;
        while(num > 0) {
            int d = num % 10;
            if(d > max) max = d;
            if(d < min) min = d;
            num /= 10;
        }
        return max - min;
    }
}