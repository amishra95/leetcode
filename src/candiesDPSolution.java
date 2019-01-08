
public class candiesDPSolution {
	public int candies(int[] arr, int n) {
		   for(int i = 1 ; i < n  ;i++){ //forward track
		        if(arr[i] > arr[i-1]){
		            dp[i] = dp[i] + dp[i-1]; 
		        }
		    }

		    for(int i = n-2 ; i >= 0 ; i--){ // back track
		        if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
		            dp[i] = dp[i+1] + 1;
		        }
		    }
	}
}
