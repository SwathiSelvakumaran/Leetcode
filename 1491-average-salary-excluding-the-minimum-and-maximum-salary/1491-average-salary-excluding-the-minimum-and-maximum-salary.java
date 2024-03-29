class Solution {
    public double average(int[] salary) {
        int min = 0;
        int max = 0;
        double sum = 0;
        for(int i=0;i<salary.length;i++){
            sum += salary[i];
            if(salary[i]>max){
                max = salary[i];
            } 
            if(min==0 || salary[i]<min){
                min = salary[i];
            }
        }
        return (sum-max-min)/(salary.length-2);
    }
}