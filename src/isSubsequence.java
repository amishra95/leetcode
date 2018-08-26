
public class isSubsequence {

	
	    public boolean isSubsequence(String s, String t) {
	        if(s == null || s.length() == 0 || t == null || t.length() == 0)
	            return true;
	        
	         Set<String> valid = new HashSet<>();
	        Set<String> invalid = new HashSet<>();
	        
	        for(int i =0; i < t.length()-1; i++){
	        for(int j  = i; j < s.length()-1; j++){
	            if(valid.contains(s)){
	                return true;
	            }
	            else if(invalid.contains(t)){
	                return false;
	            }
	            else if(isSubseq(s, t)){
	                valid.add(s);
	                return true;
	            }
	            else{
	                invalid.add(s);

	            }
	            
	        }
	        }
	        return false;
	           
	        
	}
	    
	    
	     public boolean isSubseq(String S,String word)
	    {
	        int i=0;
	        int j=0;
	        while(i<S.length()&&j<word.length())
	        {
	            if(S.charAt(i)==word.charAt(j))
	            {
	                i++;
	                j++;
	            }
	            else
	            {
	                i++;
	            }
	            
	        }
	        if(j==word.length())return true;
	        return false;
	    }

	    
	}

