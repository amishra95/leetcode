
class Solution {
    public int thirdMax(int[] nums) {
      if(nums==null || nums.length < 3){
            return 0;
        }
        
        int count = 0;
        
        distinctArr(nums);
        Arrays.sort(nums);

    for(int i = nums.length - 1; i > 0; i--){
    count = Math.min(nums[nums.length -2], nums[nums.length-3]);
    
}
        return count;

     
        
    }
    
    public int distinctArr(int arr[]){
        
        HashSet<Integer> set = new HashSet<>();
        int[] arr2 = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                arr2[index] = arr[i];
                index++;
            }
        }
    
        return arr2;
    }

    
    
        
    }
