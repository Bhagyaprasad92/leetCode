class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] prefCount = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefCount[i + 1] = prefCount[i] + (nums[i] == target ? 1 : 0);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int c = prefCount[j + 1] - prefCount[i];
                int l = j - i + 1;
                if (c * 2 > l)
                    res++;
            }
        }
        return res;
    }
}