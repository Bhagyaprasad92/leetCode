class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }
        System.out.println(st);
        int m = k;
        while(true) {
            if(!st.contains(m)) {
                return m;
            }
            m += k;
        }
    }
}