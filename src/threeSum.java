public class Solution{
public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
}

}


// ANother added solution devised by me on 11/22 ( Thursday)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == nums[i+1]){
            continue;
        }
    }
    
    int j = i+1;
    int k = nums.length -1;
    int target = -nums[i]; 
        
    while(j < k){
        if(nums[j] + nums[k] == target){
            list.add(Arrays.asList(nums[i], nums[j], nums[k]));
        }
        j++;
        k--;
        while(j < k && nums[j] == nums[j+1]) j++;
        while(j < k && nums[k] == nums[k+1]) k--;
        
    } if(nums[i] + nums[j] > target){
        k--;
        
    }
        else{
            j++;
        }
    
        return list;
    }
}
