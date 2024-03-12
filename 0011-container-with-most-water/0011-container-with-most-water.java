class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int prevsum =0;
        int sum =0;
        while (l<r){
            
            sum = Math.min(height[l],height[r]) * (r-l); 
            if(prevsum<sum)
                prevsum = sum;
            
            if(height[l]<height[r]){
                l++;
                System.out.println(prevsum);
            } else{
                r--;
                System.out.println(prevsum);
            }
        }
        return prevsum;
    }
}