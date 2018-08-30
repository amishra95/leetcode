class Solution {
    public int firstMissingPositive(int[] nums)
    {
        int mx = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == mx)
            {
                i=-1;
                mx=mx+1;
            }
        }
        return mx;
    }
}