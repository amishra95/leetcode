
public class longestNumberSubsequence {

	 public int findLHS(int[] nums) {
	    Arrays.sort(nums);
	 int min =0; int count = 0; 
	 for(int i=1;i<nums.length;)
	 {
	   if(nums[i]-nums[min]==0)
		i++;
	   else if( nums[i]-nums[min] ==1){
	        count = Math.max(count, i-min+1);
	        i++;
	  }
	 else
		min++;
	}
	 return count;

	    }
}
