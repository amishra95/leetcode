class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }    
    
    int count = 0;

    for(int i = s.length()-1; i >= 0; i--){
        if(s.charAt(i) != ' '){
            count++;
        }
         else if(count > 0){
            break;
        }
    }
        return count;
    }
}