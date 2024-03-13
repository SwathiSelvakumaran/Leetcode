class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minimum = Integer.MAX_VALUE;
        int l =0;
        
        for(int r=0;r<nums.length;r++){
            sum = sum+nums[r];
            while(target<=sum){
                minimum = Math.min(minimum, r-l+1);
                sum = sum - nums[l];
                l++;
            }
        }
        
        return minimum == Integer.MAX_VALUE ? 0 : minimum;
    }
}