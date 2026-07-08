class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a1 = new HashSet<>();
        for(int i : nums1) a1.add(i);
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for(int i : nums2) {
            if(a1.contains(i)) {
                res[k++] = i;
                a1.remove(i);
            }
        }
        return Arrays.copyOf(res, k);
    }
}