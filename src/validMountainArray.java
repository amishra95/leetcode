Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[B.length - 1]
 
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
