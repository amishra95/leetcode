class Solution {
    public int lengthOfLastWord(String s) {

    int count = 0;
    s = s.trim();
    if(s == null || s.length() == 0){
            return 0;
    }    
    //finding the space and then solving it accordingly? 
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