class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List list = new ArrayList<>();    
    Arrays.sort(nums);
    int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                list.add(nums[i]);
            }
        }
    return list;
    }
}