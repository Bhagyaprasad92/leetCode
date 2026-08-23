class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        List<Double> avgs = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            avgs.add((nums[i] + nums[n - i - 1]) / 2.0);
        }
        double min = Integer.MAX_VALUE;
        for (double i : avgs) {
            if (i < min)
                min = i;
        }
        return min;
    }
}