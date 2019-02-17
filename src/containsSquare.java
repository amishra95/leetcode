import java.util.Set;

public class containsSquare {
	public boolean judgeSquare(int c) {
		if(c < 0) {
			return false;
			
		}
		
		HashSet<Integer> set = new HashSet<>();

		

	for(int i = 0; i <= c; i++) {
		set.add(i*i);

		if(set.contains(c- i*i)) {
			return true;
		}
		
	}
	return false;

	}
}
