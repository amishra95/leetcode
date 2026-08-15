class Solution {
    public int longestSubsequence(int[] nums) {
    int n = nums.length;
    int xor = 0;
    boolean nonZero = false;

    for(int num : nums){
        xor ^= num;
        if(num != 0){
            nonZero = true;
        }
    }        
        if(xor != 0)
        return n;

        if(!nonZero){
            return 0;
        }

        return n-1;


    }
}