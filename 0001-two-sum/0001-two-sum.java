class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) { 
            for (int j = i + 1; j < nums.length; j++) { 
                // As equal i and j means same element 
                if (i == j) 
  
                    // continue keyword skips the execution 
                    // for following condition 
                    continue; 
  
                // Condition check if pair exists 
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
                    
  
            } 
        }
        return null;
    }
}