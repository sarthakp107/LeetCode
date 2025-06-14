class Solution {
    public int maxArea(int[] heights) {
        // BRUTE FORCE
        /*
        1. for the height -> smallest element (heights)
        2. area = l * h
        */

        /**Optimal solution */
       int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while(l < r){
            int smallest = Math.min(heights[l] , heights[r]);
            int width = r - l;
            int currArea = smallest * width;
            maxArea = Math.max(currArea, maxArea);
            if(heights[l] <= heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    
    }
}