import java.util.*;

public class Solution {
    static final int MOD = 1_000_000_007;

    public int countTrapezoids(int[][] points) {
        Map<Integer, List<Integer>> yToX = new HashMap<>();

        // Step 1: Group x-values by y-coordinate
        for (int[] point : points) {
            int x = point[0], y = point[1];
            yToX.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        // Step 2: Count horizontal segments at each y-level
        List<Long> segmentCounts = new ArrayList<>();
        for (List<Integer> xList : yToX.values()) {
            int n = xList.size();
            if (n >= 2) {
                long count = (long) n * (n - 1) / 2;
                segmentCounts.add(count % MOD);
            }
        }

        // Step 3: Optimize using (sum^2 - sum_of_squares) / 2
        long sum = 0, squareSum = 0;
        for (long count : segmentCounts) {
            sum = (sum + count) % MOD;
            squareSum = (squareSum + count * count % MOD) % MOD;
        }

        long result = (sum * sum % MOD - squareSum + MOD) % MOD;
        result = result * modInverse(2, MOD) % MOD;

        return (int) result;
    }

    // Modular inverse using Fermat's Little Theorem (since MOD is prime)
    private long modInverse(long a, int mod) {
        return pow(a, mod - 2, mod);
    }

    private long pow(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res = res * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return res;
    }
}