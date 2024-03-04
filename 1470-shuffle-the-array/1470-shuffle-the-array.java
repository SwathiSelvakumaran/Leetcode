class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a = 0;
        int[] result = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                result[i] = nums[a];
            } else{
                result[i] = nums[a+n];
                a++;
            }
            
        }
        return result;
    }
}