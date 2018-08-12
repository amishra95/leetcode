
public class maxProductofThreeNumbers {
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
    int maxProd = 0;
        for(int i = 0; i < nums.length; i++){
        maxProd = Math.max(nums[0]*nums[1] * nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
        return maxProd;
    }
}
