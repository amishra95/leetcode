
public class maxConsequitiveOnes {
	    public int findMaxConsecutiveOnes(int[] nums) {
	       
	int count = 0;
	    int nonCount = 0;
	        
	    for(int i = 0; i < nums.length-1; i++){
	      if(nums[i] == 1){
        count = Math.max(count, nonCount);
        }
     nonCount = 0;
      }
 return count;       
      }
}



