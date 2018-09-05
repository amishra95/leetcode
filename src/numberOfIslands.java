class Solution {
    public int numIslands(char[][] grid) {
     int[] dr = new int[]{1, -1, 0, 0};
     int[] dc = new int[]{0, 0, 1, -1};
        
    Queue<int[]> q = new LinkedList<>();
    int ans = 0;
    
    for(int i = 0; i< grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            if(grid[i][j] == '1'){
                q.add(new int[] { i, j});
                grid[i][j] = 0;
                bfs(grid, dr, dc, q);
                ans++;
            }
        }
    }
        return ans;
    }
    
    
    private void bfs(char[][] grid, int[] dr, int[] dc, Queue<int[]> q){
        while(!q.isEmpty()){
            int[] po = q.poll();
        for(int i = 0; i < 4; i++){
            int r = po[0] + dr[i];
            int c = po[1] + dc[i];
             if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') continue;
                grid[r][c] = '0';
                q.add(new int[]{r, c});
        }
       }
    }
    
}