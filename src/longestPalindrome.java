class Solution {
    
    public String longestPalindrome(String s) {
        String reversed_s = new StringBuilder(s).reverse().toString();

        if(s.equals(reversed_s)) return s;
        int[][] dp = new int[s.length() + 1][s.length() + 1];

        int maxLength = 0;
        int endIndex = 0;

    

        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= reversed_s.length(); j++){
                if(s.charAt(i - 1) == reversed_s.charAt(j - 1)){
                 //   System.out.println("check");
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                  //  if(dp[i][j] == 3) System.out.println("it is 3");
                    if(dp[i][j] > maxLength){
                        int i_start = i - dp[i][j];
                        int j_end = j;
                        // System.out.println(i + " " + j + " " + maxLength);
                        // System.out.println(i_start + " " + j_end);
                        if(i_start == s.length() - j_end){
                            maxLength = dp[i][j];
                            endIndex = i;
                        }
                        
                    }
                }else{
                        dp[i][j] = 0;
                    }
            }
        }
      
        return s.substring(endIndex - maxLength, endIndex);
    }
}
