class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int l =0;
        int temp = k;
        for(int r=0;r<nums.length;r++){
            if(temp!=0 && nums[r]==0){
                sum = sum + 1;
                temp--;
            } else if(nums[r] == 1){
                sum = sum +1;
            } else{
                sum = 0;
                temp = k;
                r=l;
                l++;
                
            }
            max = Math.max(max,sum);
            
        }
        
        return max == Integer.MIN_VALUE && sum !=0 ? sum : max ;
    }
}