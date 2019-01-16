class Solution {
    public int trailingZeroes(int n) {

            int res = 0;
    while (n >4) {
        n /= 5;
        res += n;
    }
    return res;


    }
}