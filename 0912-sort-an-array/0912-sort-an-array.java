class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int[] temp, int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, temp, l, mid);
            mergeSort(nums, temp, mid + 1, r);
            merge(nums, temp, l, mid, r);
        }
    }
    private void merge(int[] nums, int[] temp, int l, int m, int r) {
        for(int i = l; i <= r; i++) {
            temp[i] = nums[i];
        }
        int i = l, j = m + 1, k = l;
        while(i <= m && j <= r) {
            if(temp[i] <= temp[j]) {
                nums[k++] = temp[i++];
            } else {
                nums[k++] = temp[j++];
            }
        }
        while(i <= m) {
            nums[k++] = temp[i++];
        }
    }
}