class Solution {
    private static final char BACKSPACE = '#';
    
    public boolean backspaceCompare(String S, String T) {
        return constructString(S).equals(constructString(T));
    }
    
    private String constructString(String s) {
        StringBuilder sb = new StringBuilder();
        int numToBeDeleted = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == BACKSPACE) {
                numToBeDeleted++;
            } else if (numToBeDeleted > 0) {
                numToBeDeleted--;
            } else {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}
