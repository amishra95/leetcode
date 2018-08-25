
public class numberOfMatchingSubSequences {

	public int numMatchingSubseq(String S, String[] words) {
        // Array and sort it and then find the different solutions which exist here
    int count = 0;
    for(int i = 0; i < words.length; i++){
        HashSet<String> set = new HashSet<>();
       set.put(S);   
        if(set.contains(words)){
            count++;
    }
}
 return count;
     }
    
    public boolean isSubsequence(String S, String[] words){
    
    if(words.length == 0 || words == null){
        return false;
    }
        
    for(int i = 0; i < words.length; i++){
        
    }
    
        
    }
}
