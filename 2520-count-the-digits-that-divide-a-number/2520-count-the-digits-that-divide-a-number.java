class Solution {
    public int countDigits(int num) {
        int temp =-1;
        int n =num;
        int count = 0;

        while(n!=0 ){
            temp = n%10;
            System.out.println(temp);
            n = n/10;
            if(num % temp==0){
                count++;
            }
        }
        return count;
    }
}