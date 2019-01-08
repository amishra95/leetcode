// Incorrect solution(Attempt 1)
class Solution {
    public boolean repeatedSubstringPattern(String s) {
		char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
    
    for(int i = 0; i < charArray.length-1; i++){
        if(charArray[i] != charArray[i+1]){
            return true;
        }
    }
        return false;
    }
}

