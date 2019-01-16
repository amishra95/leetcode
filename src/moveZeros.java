class Solution {
    public void moveZeroes(int[] nums) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 0 && nums[i+1] != 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                swapped = true;
            }
        }
        
        }
    
    
    }
    
    
        
    
}