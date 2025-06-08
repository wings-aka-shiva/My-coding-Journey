class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int minHeight, width;
        int maxArea = 0;
        while(i < j) {
            width = j - i;
            minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, width * minHeight);

            if(height[i]<height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxArea;
    }
}