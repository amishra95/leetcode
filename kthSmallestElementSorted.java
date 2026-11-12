class Solution {
    // Solve using both Binary Search and Heaps?

    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low < high){
            int mid = low + (high-low)/2;
            if(countVal(matrix, mid) >= k){
                high= mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }


    public int countVal(int[][] matrix, int target){
        int n = matrix.length;
        int row = n-1;
        int col = 0;
        int count = 0;
    while(row >= 0 && col < n){
        if(matrix[row][col] <= target){
            count += row+1;
            col++;
        }
        else{
            row--;
        }
    }
     return count;
       }
}
