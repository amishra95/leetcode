class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;
       
       int start = 0;
       int end = m*n-1;
    
    while(start <= end){
        int pos = start + (end-start)/2;
        int row = pos/n;
        int col = pos%n;

        if(matrix[row][col] == target){
            return true;
        }

        if(matrix[row][col] > target){
            end = pos-1;
        }
        else{
            start = pos+1;
        }
    }
    

    return false;


    }
}
