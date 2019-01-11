/**
 * In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.


 * @author Avanish Mishra
 *
 */
class Solution {
    public int dominantIndex(int[] nums) {
        boolean candidateFound = true;
        int candidate = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[candidate] < 2 * nums[i]) candidateFound = false;
            if (nums[i] >= 2 * nums[candidate]) {
                candidate = i;
                candidateFound = true;
            }
        }
        if (!candidateFound) return -1;
        return candidate;
    }
}
