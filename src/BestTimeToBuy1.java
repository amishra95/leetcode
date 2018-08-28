
public class BestTimeToBuy1 {
	public int maxProfit(int[] prices) {
		int maxCur = 0;
		int maxFar = 0;
	for(int i = 1; i < prices.length; i++) {
		maxCur = Math.max(0,  maxCur += prices[i]- prices[i-1]);
		maxFar = Math.max(maxCur, maxFar);
	}
return maxFar;
	}
}
