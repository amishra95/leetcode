class Solution {
    public int maxProduct(int n) {
        
        int res = 0;
        String s = String.valueOf(n);
        Integer[] digits = new Integer[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            digits[i] = s.charAt(i) - '0';
        }

        Arrays.sort(digits);
        
        for(int i = digits.length; i >=0; i--){
            res = digits[digits.length-1] * digits[digits.length-2];
        }

        return res;
    


        
    }
}