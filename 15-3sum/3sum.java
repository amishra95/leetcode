import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int k = -(nums[i] + nums[j]);

                if (set.contains(k)) {
                    list.add(Arrays.asList(nums[i], k, nums[j]));

                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }

                set.add(nums[j]);
            }
        }

        return list;
    }
}