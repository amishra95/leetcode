class Solution {
    public boolean checkDivisibility(int n) {
        
        // 99 -> How to find sum 
        int x = n; 
        int sum = 0; 
        int prodSum = 1; 
           
        
        while(x > 0){
         int r=x%10;
         sum += r; 
        prodSum=prodSum*r;
         x=x/10;
    }

    if(n %(sum + prodSum) == 0){
        return true;
    }
    
    return false;


    }
}
