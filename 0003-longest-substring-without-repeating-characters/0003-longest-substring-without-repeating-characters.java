class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int l=0,r=0;
        if(n<2) return n;
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        
        int maxLength = 0;
        while(r<n){
            hm.put(arr[r], hm.getOrDefault(arr[r], 0) + 1);
            
            while(hm.size() != r-l+1){
                hm.put(arr[l], hm.get(arr[l])-1);
                if(hm.get(arr[l]) == 0){
                    hm.remove(arr[l]);
                }
                l++;
            }
            maxLength = Math.max(maxLength , r-l+1);
            r++;
        }
        
        return maxLength;
        

    }
}