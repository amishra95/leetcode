class Solution {
    public boolean validMountainArray(int[] A) {
        if(A == null || A.length < 3){
            return false;
        }
        
    int i = 1;
        
    while(i < A.length && A[i-1] < A[i]){
        i++;
    }
        
    if(i == A.length || i==1){
        return false;
    }
    
    while(i < A.length && A[i-1] > A[i]){
        i++;
    }
        return (i==A.length);
        
    }
}