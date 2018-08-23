
public class triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
	    int[] A = new int[triangle.size()+1];
	    for(int i=triangle.size()-1;i>=0;i--){
	        for(int j=0;j<triangle.get(i).size();j++){
	            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	        }
	    }
	    return A[0];
	}
}


// The below solution was a 2.4% fast solution

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle, 0, 0, new HashSet<>());
    }
    public int helper(List<List<Integer>> triangle, int x, int y, Set<String> visited){
        if(x >= triangle.size() || y >= triangle.size()){
            return 0;
        }
        if(visited.contains(x + " " + y)){
            return triangle.get(x).get(y);
        }
        int left = helper(triangle, x+1, y, visited);
        int right = helper(triangle, x+1, y+1, visited);
        int sum = Math.min(left, right) + triangle.get(x).get(y);
        triangle.get(x).set(y, sum);
        visited.add(x + " " + y);
        return sum;
        
    }
}


// THis is the fastest Solution
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
	if(triangle == null || triangle.size() == 0)
            return 0;
    int n = triangle.size();
    int[] dp = new int[n+1];
        
for(int i = n-1;i >= 0; i--){
    List<Integer> list = triangle.get(i);
   for(int j = 0; j <= i; j++){
       dp[j]= list.get(j) + Math.min(dp[j], dp[j+1]);
   } 
   
    
    
}        
    return dp[0];
        
    }
}
