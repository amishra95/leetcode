class Solution {
    public int minimumDeletions(int[] nums) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int minIndex = -1;
    int maxIndex = -1;

    int minDist =0;
    int maxDist = 0;


    int n = nums.length;

    for(int i = 0; i <= n-1; i++){
        if(nums[i] < min){
            min = nums[i];
            minIndex = i;
        }
        if(nums[i] > max){
            max = nums[i];
            maxIndex = i;
        }
    }

    int left = Math.min(minIndex, maxIndex);
    int right = Math.max(minIndex, maxIndex);


    int front = right+1;
    int back = n-left;
    int both = (left+1) + (n-right);


    return Math.min(front, Math.min(back,both));
    
        
    }
}