class Solution {
    public int maxArea(int[] heights) {
        
      int left=0;
      int right=heights.length-1;

      int maxvalue=0;
        
        while(left < right)
        {
           int value=Math.min(heights[left],heights[right])*(right-left);

           maxvalue=Math.max(maxvalue,value);

           if(heights[left] > heights[right])
           {
            right--;
           }
           else{
            left++;
           }
        }

        return maxvalue;
    }
}
