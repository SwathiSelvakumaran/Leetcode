class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr, 0, arr.length-1);
    }
    
    private int binarySearch(int[] arr, int first, int last){
        int mid = first +(last-first)/2;
        
        if(first>last){
            return first;
        }
        
        if(mid!=0 && arr[mid]<arr[mid-1]){
            return binarySearch(arr, first, mid-1);
        } else if(mid!=arr.length-1 && arr[mid]<arr[mid+1]){
            return binarySearch(arr, mid+1, last);
        } else{
            return mid;
        }
    }
}