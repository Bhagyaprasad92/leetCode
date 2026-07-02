class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while(left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return maxArea;
    }
}