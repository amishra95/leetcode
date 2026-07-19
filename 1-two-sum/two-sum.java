class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int valid = target- nums[i];

            if(map.containsKey(valid)){
               return new int[] {map.get(valid), i};
            }
            map.put(nums[i], i);
        
        }   

        return new int[]{};
    
        
    }
}