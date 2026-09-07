class Solution {
    public int distinctSubseqII(String s) {

        int[] dp = new int[26];

        for(int i = 0; i < s.length(); i++){
            int charIndex = s.charAt(i) - 'a';
            dp[charIndex] = sum(dp) + 1;
        }
        return sum(dp);
    }

    private int sum(int[] array){
        int cal = 0;
   
    for(int arr : array){
        cal = (arr + cal) % (int)(1e9 + 7);
    }
    return cal;
    }
    
    }
