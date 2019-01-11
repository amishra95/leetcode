class cherryPickup {
    
    public int cherryPickup(int[][] grid) {
        int count = 0;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        if(grid == null && grid.length == 0 && grid[0].length == 0){
            return 0;
        }  
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] ==1 && !visited[i][j]){
                    count++;
                }
                if(grid[i/2][j/2] == -1 && !visited[i/2][j/2]){
                    return 0;
                }
               
               
            }
        }
      
        return count;
    }
    
      public static boolean isSafe(int i, int j, int matrix[][]) { 
          
        if(i>=0 && i<matrix.length && j>=0 
                       && j<matrix[0].length) 
            return true; 
        return false;  
    } 

    public boolean helper(int[][] grid,int i, int j,boolean[][] visited){
        if(isSafe(i, j, grid) && grid[i][j] != 0  && !visited[i][j]){
            visited[i][j] = true;
                if(grid[i][j] == 1 || grid[i][j] == 0){
                return true;
            }
        
            boolean up = helper(grid, i-1,j, visited);
            if(up){
                return true;
            }
            
            boolean down = helper(grid, i+1, j, visited);
            if(down){
                return true;
            }
            
            boolean left = helper(grid, i, j-1, visited);
            if(left){
                return true;
            }
        
            boolean right = helper(grid, i, j+1, visited);
                
            if(right){
                return true;
            }
            
        }
        return false;
    }
}