class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] buc = new List[nums.length + 1];
        for(int i : count.keySet()) {
            int freq = count.get(i);
            if(buc[freq] == null) {
                buc[freq] =  new ArrayList<>();
            }
            buc[freq].add(i);
        }
        int[] res = new int[k];
        int i = 0;
        for(int j = buc.length - 1; j >= 0; j--) {
            if(buc[j] != null) {
                for(int val : buc[j]) {
                    res[i++] = val;
                    if(i == k) return res;
                }
            }
        }
        return res;
    }
}