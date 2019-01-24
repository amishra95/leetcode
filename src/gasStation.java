class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        
    for(int i = 0; i < gas.length; i++){
        totalCost += gas[i] - cost[i];
    }
        if(totalCost < 0){
            return -1;
        }
        
    int start = 0;
    int save = 0;
        for (int i = 0; i < gas.length; i++) {
			int currentGain = gas[i] - cost[i];
			if (save + currentGain < 0) {
				start = i + 1;
				save = 0;
			} else {
				save += currentGain;
			}
		}
		return start;
        
    
    }
}