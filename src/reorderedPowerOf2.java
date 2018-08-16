class Solution {
    public boolean reorderedPowerOf2(int N) {
        return permutation(s, 0);
    }
    
    public void convertString(int N){
        StringBuilder sb = new StringBuilder();
        sb.append(N);
        String str = sb.toString();
    }
    
   
    public String swapChars(String str, int lIdx, int rIdx){
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx);
        char r = sb.charAt(rIdx);
        return sb.toString();
        
    }
    
    public boolean permutation(StringBuilder sb, int pos){
        if(pos==str.length()&& isPowerOfTwo(str.toString())){
            return true;
        }
        
        for(int i = pos; i < str.length(); i++){
            swapChar(str, pos, i);
            if(str.charAt(0) != '0'){
                if(permutation(str, pos+1)){
                    return true;
                }
            }
            swapChars(str, pos, i);
        }
        return false;
    }
    
    
    
}