class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            
            if(nums == null){
                return false;
            }
            
            Arrays.sort(nums);
        
            int diff = 0;
        for(int i= 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                   diff = Math.abs(Math.min(nums[i]- nums[j], k));
                    if(diff < k){
                        return true;
                    }
                }             
                }
            }    
            return false;

        }
    
   
}