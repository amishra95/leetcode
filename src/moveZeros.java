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


// Solved with O(N)^2 time complexity which is as follows; @amishra95


class Solution {
    public void moveZeroes(int[] nums) {

      for(int i = 0; i < nums.length-1; i++){

             swap(nums);
      }

}

    //Create a swap method that swaps, integers
    public void swap(int[] nums){
    
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]== 0 && nums[i+1] != 0){
                int tmp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = tmp;
            }
        }
    }

   
}
