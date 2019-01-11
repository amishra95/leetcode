
public class nimGame {
    public boolean canWinNim(int n) {

	if(n <= 0)
	    throw new IllegalArgumentException();
	return !(n % 4 == 0);
    }
}
