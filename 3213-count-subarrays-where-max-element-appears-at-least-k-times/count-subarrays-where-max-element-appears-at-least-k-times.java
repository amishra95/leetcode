class Solution {
    public long countSubarrays(int[] nums, int k) {

        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        int maxValue = nums[maxIndex];
        
        int left = 0;
        int maxOcc = 0;
        long res = 0;
        

    for(int right = 0; right < nums.length; right++){
        if(nums[right] == maxValue){
            maxOcc++;
        }
        while(maxOcc >= k){
            res += nums.length - right;
            if(nums[left] == maxValue){
                maxOcc--;
                
            }
            left++;
        }
    }

    return res;
        
    }
}