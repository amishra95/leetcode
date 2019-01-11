class Solution {
    public boolean hasAlternatingBits(int n) {
                int m = n ^ (n >> 1);
        if ((m & (m + 1)) == 0)
            return true;
        else
            return false;

    }
}