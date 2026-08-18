class Solution {
    public int largestInteger(int[] nums, int k) {

    //Almost missing condition: it appears in only one subarray
    
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    }
    
    if(k == 1){
       int unique = -1;
       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                unique = Math.max(unique, entry.getKey());
            }
       }
       return unique;
    }

    if(k == nums.length){
       int maxVal = -1;
       for(int num : nums){
        maxVal = Math.max(maxVal, num);
       }
    return maxVal;
    }

    
    
    int result = -1;
    if(map.get(nums[0]) == 1){
        result = Math.max(result, nums[0]);
    }
    if(map.get(nums[nums.length-1]) == 1){
        result = Math.max(result, nums[nums.length-1]);
    }


    return result;

    


        
    }
}