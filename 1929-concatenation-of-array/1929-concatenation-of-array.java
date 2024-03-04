class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] temp = new int[2*nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        System.arraycopy(nums,0,temp,nums.length,nums.length);
        return temp;
    }
}