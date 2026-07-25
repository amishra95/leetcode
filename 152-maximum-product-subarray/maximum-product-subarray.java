class Solution {
    public int maxProduct(int[] nums) {

    int maxprod = nums[0];
    int minprod = nums[0];   
    int result = nums[0];

        for(int i = 1; i < nums.length; i++){
          int oldmax = maxprod;
          int oldmin = minprod;

            maxprod= Math.max(nums[i], Math.max(nums[i]*oldmax, nums[i] * oldmin));
            minprod = Math.min(nums[i], Math.min(nums[i]* oldmax, nums[i]* oldmin));

            result = Math.max(result, maxprod);

        
        }

        return result;


    }
}