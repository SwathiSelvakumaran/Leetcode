class Solution {
    public int kthFactor(int n, int k) {
        
        List<Integer> arr = new ArrayList();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
                //System.out.println(arr);
            }
        }
        //Collections.sort(arr);
        // if(n==1 && k==1)
        //     return 1;
        // else 
        if(arr.size()<k)
            return -1;
        else
            return arr.get(k-1);
    }
}