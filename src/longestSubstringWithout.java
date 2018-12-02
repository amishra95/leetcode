class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max = 0; 
        
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int count = 0;
        for(int j = 0; j < s.length(); j++){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), j);
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                if( i < s.length()){
                    j = i;
                }
                i++;
                count = 0;
                map.clear();
            }
        
    }  
        return max;
    
    }
}
