class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int[] dp = new int[K];
        int result = 0;
        for(int a : A){
            int[] dp2 = new int[K];
            for(int i = 0; i < K; i++){
                if(dp[i] > 0){
dp2[(i + K + (a%K)) % K] = dp[i];
            }
        }
            dp2[((a %K) + K) % K]++;
            dp = dp2;
            result += dp[0];
    }
        return result;
    }
    
}
/**
solution 2 using HashMap
*/
class Solution {
    public int subarraysDivByK(int[] A, int K) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int count = 0;
        int totalCount = 0;
        
        map.put(count, 1);
        for(int i : A){
            count = (((count + i)%K)+K)%K;
            int newVal = 1;
            if(map.containsKey(count)){
                totalCount += map.get(count);
                newVal += map.get(count);
            }
            map.put(count, newVal);
        }
         return totalCount;
        
    }
}

/** 
Solution 3 using simple Math
*/
