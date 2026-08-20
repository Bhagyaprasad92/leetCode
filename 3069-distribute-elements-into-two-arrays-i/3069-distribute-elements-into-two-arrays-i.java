class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i = 2; i <= nums.length - 1; i++) {
            if(a.get(a.size() - 1) > b.get(b.size() - 1)) {
                a.add(nums[i]);
            } else b.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int idx = 0;
        for(int v : a) res[idx++] = v;
        for(int v : b) res[idx++] = v;
        return res;
    }
}