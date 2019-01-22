class Solution {
    public int[] sortedSquares(int[] A) {
        
   int n = A.length;
    for(int i =0; i < n; i++){
         A[i] =  A[i] * A[i];    
    }
        Arrays.sort(A);        
        return A;
    }
}