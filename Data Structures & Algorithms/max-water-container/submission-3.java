class Solution {
    public int maxArea(int[] heights) {
        

        int left = 0;
        int right = heights.length - 1;
        int min = Math.min(heights[left], heights[right]);

            int maxArea = (right - left) * min;
            int newArea = (right - left) * min;

        while(left < right){

            min = Math.min(heights[left], heights[right]);

            if (heights[left] < heights[right]){
            left++;
            newArea = ((right - left) + 1) * min;

                if (newArea > maxArea){
                    maxArea = newArea;
                }
            }else if(heights[right] < heights[left]){
                right--;
                newArea = ((right - left) + 1) * min;

                if (newArea > maxArea){
                    maxArea = newArea;
                }
            }else{
                left++;
                newArea = ((right - left)+1) * min;

                if (newArea > maxArea){
                    maxArea = newArea;
                }
            }

        }
        return maxArea;
    }
}
