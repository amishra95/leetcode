/**
Intuition
The goal is to find a triplet of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
Probably need to store 2 values but no need to store the 3rd because we can just return true if the 3rd value is greatest
Approach
Utilize a two-pointer approach to keep track of the minimum and middle elements seen so far
Initialize two variables minNum and midNum to hold the minimum and middle elements, respectively. Set both variables to the maximum possible value (Integer.MAX_VALUE) initially.
Iterate through the array nums from left to right.
For each number num encountered:
If num <= minNum, update minNum to num. This ensures that we always have the smallest number seen so far.
If minNum <= num <= midNum, update midNum to num. This ensures that we always have the second smallest number seen so far.
If we encounter a number greater than both minNum and midNum, it means we have found an increasing triplet. Return true.
If we complete the iteration without finding an increasing triplet, return false.
The solution works because if there exists an increasing triplet, the smallest and middle elements must be initialized at some point. By updating minNum and midNum as we iterate through the array, we ensure that we always have the smallest and middle elements seen so far. If a number greater than both minNum and midNum is encountered, it means we have found an increasing triplet, and we return true. Otherwise, if we complete the iteration without finding a triplet, we return false.


 */

class Solution {
    public boolean increasingTriplet(int[] nums) {
               // Initialize the minimum and middle number to max possible value

        if(nums.length < 3){
            return false;
        }
    
    int minNum = Integer.MAX_VALUE;
    int midNum = Integer.MAX_VALUE;

//Iterate through the loop
    for(int num : nums){
        if(num <= minNum){
            minNum = num;

        } else if(num <= midNum){
            midNum = num;
            
        }
        else{
            return true;
        }
    }

        return false;

    }
}
