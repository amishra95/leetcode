
public class jewelsAndStones {
	public int numJewelsInStones(String J, String S) {
        int count = 0;
        
        for(int i = 0; i < J.length(); i++){
            for(char c: S.toCharArray()){
                if(c == J.charAt(i)){
                    count++;
                }
            }
            
        }
                return count;

    }    
}

