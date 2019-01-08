//correct changes using regex
class Solution {
    public boolean repeatedSubstringPattern(String s) {
		return s.matches("(.+)\\1+");
    }
}

