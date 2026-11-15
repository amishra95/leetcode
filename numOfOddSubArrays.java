class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long count = 0;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];                   
        for (int i = 1; i < n; i++) {            
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int even = 1; 
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] % 2 == 1) {
                count += even; 
                odd++;
            } else {
                count += odd;   
                even++;
            }
        }
        return (int) (count % 1_000_000_007);
    }
}
