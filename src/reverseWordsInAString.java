


class Solution {
    public String reverseWords(String s) {
        //"the sky is blue"
        // "blue is the sky"

    String[] str = s.trim().split(" ");
        
    StringBuilder sb = new StringBuilder();
    
    for(int i = str.length -1; i >= 0; i--){
        if(str[i].length() > 0){
            sb.append(str[i]);
            sb.append(' ');
        }
    }
        return sb.substring(0, sb.length()-1).toString();
    }
}
