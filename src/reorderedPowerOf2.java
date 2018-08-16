class Solution {
    private boolean isPowerOfTwo (String s)
    {
        int x = Integer.parseInt(s);
        return x!=0 && ((x&(x-1)) == 0);
    }
    
    private void swapChar(StringBuilder str, int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }
    
    public boolean findPermutation(StringBuilder str, int pos){
        if(pos==str.length()&& isPowerOfTwo(str.toString())){
            return true;
        }
        for(int i=pos; i< str.length();++i){
            swapChar(str,pos,i);
            if(str.charAt(0)!='0'){
                if(findPermutation(str,pos+1)){
                    return true;
                }
            }
            swapChar(str,pos,i);
        }
        return false;
    }
    
    public boolean reorderedPowerOf2(int N) {
        StringBuilder s = new StringBuilder();
        s.append(Integer.toString(N));
        return findPermutation(s,0);
    }
}

