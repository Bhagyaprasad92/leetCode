class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i : nums) {
            if(i > 0) pos.add(i);
            if(i < 0) neg.add(i);
        }
        int[] res = new int[nums.length];
        int i = 0, j = 1;
        int listIndex = 0;
        while(i < j && j < nums.length) {
            res[i] = pos.get(listIndex);
            res[j] = neg.get(listIndex);
            i += 2;
            j += 2;
            listIndex++;
        }
        return res;
    }
}