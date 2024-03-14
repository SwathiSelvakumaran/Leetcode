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
                // System.out.println("sum 0:" + sum);
            } else if(nums[r] == 1){
                sum = sum +1;
                // System.out.println("sum 1:"+ sum);
            } else{
                
                // System.out.println("max:" + max);
                sum = 0;
                // System.out.println("reset sum:" + sum);
                temp = k;
                r=l;
                l++;
                
            }
            max = Math.max(max,sum);
            
            // while(<=sum){
            //     max = Math.max(max, r-l+1);
            //     sum = sum - nums[l];
            //     l++;
            // }
        }
        
        return max == Integer.MIN_VALUE && sum !=0 ? sum : max ;
    }
}