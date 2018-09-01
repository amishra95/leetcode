class Solution {
    public boolean increasingTriplet(int[] nums) {
       if(nums == null || nums.length == 0)
           return false;
        
        int low = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
    
    for(int i = 0; i < nums.length; i++){
        if(nums[i] < low)
            low = nums[i];
    if(nums[i] < mid && nums[i] > low)
        mid = nums[i];
    if(nums[i] > mid)
        return true;
        
    }
    
        return false;
    }
}