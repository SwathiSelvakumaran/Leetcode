class Solution {
   //private static int temp = 10^4;
        
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while (left < right) {
            int midpoint = left + (right - left) / 2; // same as (left + right) / 2
            if (x - arr[midpoint] > arr[midpoint + k] - x) {
                left = midpoint + 1;
            }
            else {
                right = midpoint;
            }
        }
        
        List<Integer> ele = new ArrayList<Integer>();
        for( int i =left; i<left+k;i++){
            ele.add(arr[i]);
        }
        return ele;
    }
}