class Solution {
    public boolean makesquare(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        if (total == 0 || total % 4 > 0) return false;
        total /= 4;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (!search(nums, nums.length - 1, 0, total)) return false;
        }
        return true;
    }
    
    private boolean search(int[] nums, int start, int sum, int target) {
        if (start < 0 || sum > target) return false;
        for (int i = start; i >= 0; i--) {
            if (nums[i] == 0) continue;
            int temp = nums[i];
            nums[i] = 0;
            if (sum + temp == target || search(nums, i - 1, sum + temp, target)) return true;
            nums[i] = temp;
        }
        return false;
    }
}

