class Solution {
    public int missingInteger(int[] nums) {

    HashSet<Integer> set = new HashSet<>();
    
    for(int n: nums){
        set.add(n);
    }

    
    int sum = nums[0];

    for(int i = 0; i < nums.length-1; i++){
        if(nums[i] + 1 == nums[i+1]){
            sum += nums[i+1];
        }
        else{
            break;
        }
    }
    
    while(set.contains(sum)){
        sum++;
    }
    return sum;

}
}