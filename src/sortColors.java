/**Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/
class Solution {
    public void sortColors(int[] nums) {
        int[] color = new int[3];
        for(int i = 0; i < nums.length; i++){
            color[nums[i]]++;
        }
        int curr = 0;
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < color[i]; j++){
                nums[curr++] = i;
            }
        }
    }
}
