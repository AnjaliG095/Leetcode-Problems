class Solution {
    public int smallestNumber(int n, int t) {
        int number = n;
        while(true){
            int product = 1;
            n = number;
            while(n>0){
                product = product * (n %10);
                n=n/10;
            }
            if(product%t==0){
               return  number;
            }
            
                number++;
            
        }
       
    }
}