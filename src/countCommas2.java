class Solution {
    public long countCommas(long n) {
        long ans = 0;
        if (n > 999) {
            ans += n - 999;
        }
        if (n > 999999) {
            ans += n - 999999;
        }
        if (n > 999999999L) {
            ans += n - 999999999L;
        }
        if (n > 999999999999L) {
            ans += n - 999999999999L;
        }
        if (n > 999999999999999L) {
            ans += n - 999999999999999L;
        }

        return ans;
    }
}
