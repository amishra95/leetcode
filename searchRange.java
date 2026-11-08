class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sol = new int[2];
        sol[0] = firstFind(nums, target);
        sol[1] = endFind(nums, target);
        return sol;
    }

    private int firstFind(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] >= target){
                end= mid-1;
            }
            else{
                start = mid+1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }

    private int endFind(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] <= target){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
}
