class Solution {
    private void merge(int[] nums, int l, int r) {
        if(l >= r) {
            return;
        }
            int mid = l + (r - l) / 2;
            merge(nums, l, mid);
            merge(nums, mid + 1, r);
            mergeSort(nums, l, mid, r);
    }
    private void mergeSort(int[] nums, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++) {
            L[i] = nums[l+i];
        } 
        for(int i = 0; i < n2; i++) {
            R[i] = nums[m+1+i];
        }
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }
        while(i < n1) {
            nums[k++] = L[i++];
        }
        while(j < n2) {
            nums[k++] = R[j++];
        }
    }
    public void sortColors(int[] nums) {
        merge(nums, 0, nums.length - 1);
    }
}