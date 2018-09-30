
public class increasingArray {
	 public boolean checkPossibility(int[] nums) {
	        int cnt = 0, n = nums.length; 
	        for (int i = 0; i < n - 1; i++) {
	            if (nums[i] > nums[i + 1]) {
	                cnt++;
	                if (i >= 1 && nums[i + 1] < nums[i - 1])
	                    nums[i + 1] = nums[i]; 
	            } 
	            if (cnt > 1) return false; 
	        }
	        return true;
	    }

}
