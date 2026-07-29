class Solution {
    public void moveZeroes(int[] nums) {
       int i = 0; 
       int j = 0;

       while (i < nums.length){
        if(nums[i] != 0){
            swap(nums, i, j);
            j++;
        }
        i++;
       }
    }
     public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}