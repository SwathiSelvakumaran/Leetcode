class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i], 1);
        }
        for(int j=0;j<nums2.length;j++){
            if(hm.get(nums2[j])!=null && hm.get(nums2[j])==1){
                return nums2[j];
            } 

        }
        return -1;
    }
}