
public class singleNumber {
	
	    public int singleNumber(int[] nums) {
	        if(nums.length==1) return nums[0];
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length;i+=2){
	            if(nums.length==i+1||nums[i]!=nums[i+1]) return nums[i];
	        }
	        return 0;
	    }
	


}
