
public class deleteAndEarn {
	 public int deleteAndEarn(int[] nums) {
	     
	        int[] dp = new int[10000];
	        for(int num : nums) dp[num] += num;
	        for(int i = 2; i < dp.length; i++) dp[i] = Math.max(dp[i-1], dp[i-2] + dp[i]);
	        return dp[dp.length - 1];
	    }

}
