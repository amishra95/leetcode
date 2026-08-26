class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String str = "";
        int left = 0;
        int ones = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                ones++;
            }

            while (ones == k) {
                int len = right - left + 1;

                if (len < minLength) {
                    minLength = len;                         
                    str = s.substring(left, right + 1);
                } else if (len == minLength) {
                    String candidate = s.substring(left, right + 1); 
                    if (candidate.compareTo(str) < 0) {
                        str = candidate;
                    }
                }

                if (s.charAt(left) == '1') ones--;
                left++;
            }
        }

        return str;
    }
}