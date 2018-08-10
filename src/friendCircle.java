
public class friendCircle {
	 public int findCircleNum(int[][] M) {
		    
		 int groups = 0;
		         
		         int N = M.length;
		     
		         boolean[] visited = new boolean[N];
		         
		     for(int i = 0; i <N; ++i){
		         if(!visited[i]){
		             dfs(i, M, visited);
		             ++groups;
		         }
		     }
		  return groups;
		             
		         
		     }
		         
		     private void dfs(int cur, int[][] M, boolean[] visited)
		     {
		         visited[cur] = true;
		     for(int i = 0; i < M[cur].length; ++i){
		         if(!visited[i] && M[cur][i] ==1){
		             dfs(i, M, visited);
		         }
		     }
		         
		     }

}
