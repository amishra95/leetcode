class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] array = new int[nums.length];

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    array = new int[] {i, j};
                }
            }
            
        }

        return array;
        
    }
}
