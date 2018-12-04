
public class minimumXOR {

	public int minXor(int[] nums) {
		
	int min = Integer.MAX_VALUE;
	
for(int i = 0; i < nums.length; i++) {
	for(int j = i+1; j < nums.length; j++) {
		min = Math.min(min, nums[i] ^ nums[j]);
	}
}
		return min;
	}
}
