
public class isSubsequence {
	public boolean isSubsequence(String s, String t) {
	
		if(s.length() == 0)
			return true;
	    
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		int i = 0;
		int j = 0;
		
		while(i< c1.length && j < c2.length) {
			if(c1[i] != c2[i]) {
				j++;
			}
			else {
				i++;
				j++;
			}
		}
		
		return i == c1.length;
	}
}

