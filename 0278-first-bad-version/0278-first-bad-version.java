/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }
    private int binarySearch(int low, int high) {
        if(low > high) return low;
        int mid = low + (high - low) / 2;
        if(isBadVersion(mid)) return binarySearch(low, mid - 1);
        else return binarySearch(mid + 1, high);
    }
}