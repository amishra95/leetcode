class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalCount = 0;
        
        // Create DP table - dp[i][j] = largest square size ending at (i,j)
        int[][] dp = new int[rows][cols];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 1){
                    if(i == 0 || j == 0){
                        // Base case: First row or first column
                        // Can only make 1x1 squares here
                        dp[i][j] = 1;
                    } else {
                        // The key DP insight:
                        // To make a square of size k ending at (i,j), we need:
                        // - A square of size (k-1) ending at (i-1, j-1) [diagonal]
                        // - A square of size (k-1) ending at (i-1, j) [above] 
                        // - A square of size (k-1) ending at (i, j-1) [left]
                        
                        // So the largest square we can make is limited by 
                        // the SMALLEST of these three neighbors
                        
                        // Take the minimum of the three neighbors and add 1
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                    }
                    
                    // This is the magic part:
                    // If dp[i][j] = 3, it means we can make squares of size 1, 2, and 3
                    // all ending at this position. So this cell contributes 3 to our answer!
                    totalCount += dp[i][j];
                    
                } else {
                    // Can't make any square ending with a 0
                    dp[i][j] = 0;
                }
            }
        }
        
        return totalCount;
    }
}