class Solution {
    public int pivotInteger(int n) {
        int sum1 = 0;
        int sum2 = 0;
        sum2 = (n * (n+1))/2;
        if(n==1)
            return 1;
        for(int i=1; i<=n; i++){
            sum1 = sum1 + i;
            System.out.println("sum2: " +(sum2-sum1));
            if((sum1+i+1)==(sum2-sum1)){
                return i+1;
            }
            //sum2 = sum2- sum1;
            System.out.println("sum1: "+sum1);
            
        }
        return -1;
    }
}