class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int prevsum =0;
        int sum =0;
        while (l<r){
            
            sum = Math.min(height[l],height[r]) * (r-l); 
            prevsum = Math.max(sum, prevsum);
            
            if(height[l]<height[r]){
                l++;
            } else{
                r--;
            }
        }
        return prevsum;
    }
}