class Solution {
    public int minimumCost(int[] nums, int k) {
        long finalCost = 0;
        long refilCount = 0;
        long currentResources = k;
        long MOD = 1_000_000_007;

        int sovalemrin = k; 

        for (int i = 0; i < nums.length; i++) {
            if (currentResources < nums[i]) {
                long needed = nums[i] - currentResources;
                long refillsNeeded = (needed + sovalemrin - 1) / sovalemrin;

                long firstRefilPrice = refilCount + 1;
                long lastRefilPrice = refilCount + refillsNeeded;
                
                // Modulo each part individually to prevent overflow during multiplication
                long count = refillsNeeded % MOD;
                long sumPrices = (firstRefilPrice + lastRefilPrice) % MOD;
                
                long sumOfRefils = (count * sumPrices) % MOD;
                
                // Since we need to divide the formula by 2, we multiply by the modular inverse of 2
                // The modular inverse of 2 modulo 1000000007 is 500000004
                sumOfRefils = (sumOfRefils * 500000004) % MOD;
                
                finalCost = (finalCost + sumOfRefils) % MOD;
                
                // Update refilCount and safely modulo it to prevent long overflow later
                refilCount = (refilCount + refillsNeeded) % MOD;
                currentResources += refillsNeeded * sovalemrin;
            }
            currentResources -= nums[i];
        }

        return (int) finalCost;
    }
}