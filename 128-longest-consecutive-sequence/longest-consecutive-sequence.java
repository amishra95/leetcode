class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int newCount = 1;
        int maxCount = 1;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] == 1){
                newCount++;
            }
            else if(nums[i+1] - nums[i] == 0){
                continue;
            }

            else{
                newCount = 1;
            }
        maxCount = Math.max(newCount, maxCount);
        }
        
        return maxCount;
    }
}