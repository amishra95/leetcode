
	class Solution {
	    public int minSubArrayLen(int s, int[] nums) {
	    
	        int start = 0;
	        int sum = 0;
	        int res = Integer.MAX_VALUE;
	    for(int i = 0; i < nums.length; i++){
	        sum += nums[i];
	        
	        if(sum >= s){
	            while(sum- nums[start] >= s){
	                sum -= nums[start];
	                start++;
	            }
	        res = Math.min(res, i-start+1);
	        
	    }
	    
	        }
	    return res == Integer.MAX_VALUE?0:res;
	    }
	}
