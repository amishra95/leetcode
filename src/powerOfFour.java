
public class powerOfFour {

	class Solution {
	    public boolean isPowerOfFour(int num) {
	    
	       if(num == 0){
	           return false;
	       }
	        
	    if(num == 1){
	        return true;
	    }
	      
	    if(num ==4){
	        return true;
	    }
	        if(num == 16){
	            return true;
	        }
	        
	    if(num == 64){
	        return true;
	    }
	        if(num == 256){
	            return true;
	        }
	        
	        if(num == 1024){
	            return true;
	        }
	        
	        if(num == 4096){
	            return true;
	        }
	        
	    if(num == 16384){
	            return true;
	        }
	        if(num == 65536){
	            return true;
	        }
	        if(num == 262144){
	            return true;
	        }
	        
	        if(num == 1048576){
	            return true;
	        }
	        if(num == 4194304){
	            return true;
	        }
	        if(num == 16777216){
	            return true;
	        }
	        if(num == 67108864){
	            return true;
	        }
	        if(num == 268435456){
	            return true;
	        }
	        if(num == 1073741824){
	            return true;
	        }
	int n = Integer.MAX_VALUE;
	int m = Integer.MIN_VALUE;
	        
	        
	        while((num > n) && (num > m)){
	        if(num % 2 != 0){
	            return false;
	        }
	        
	      if(num % 4 == 0){
	          return true;
	      }

	            
	            
	        }
	return false;
	    }
	    
	}
}
