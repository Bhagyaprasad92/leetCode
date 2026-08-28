class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int low, int high) {
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }
    private void merge(int[] nums, int low, int mid, int high) {
        int m = mid - low + 1;
        int n = high - mid;
        int[] L = new int[m];
        int[] R = new int[n];
        for(int i = 0; i < m; i++) {
            L[i] = nums[low + i];
        }
        for(int i = 0; i < n; i++) {
            R[i] = nums[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while(i < m && j < n) {
            if(L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < m) {
            nums[k++] = L[i++];
        }
        while(j < n) {
            nums[k++] = R[j++];
        }
    }
}