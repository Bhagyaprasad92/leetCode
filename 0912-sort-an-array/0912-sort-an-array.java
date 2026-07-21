class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }
    private void merge(int[] nums, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; ++i) {
            L[i] = nums[l + i];
        } 
        for(int i = 0; i < n2; ++i) {
            R[i] = nums[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                nums[k] = L[i++];
            } else {
                nums[k] = R[j++];
            }
            k++;
        }
        while(i < n1) {
            nums[k++] = L[i++];
        }
        while(j < n2) {
            nums[k++] = R[j++];
        }
    }
}