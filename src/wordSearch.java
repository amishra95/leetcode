class Solution {
       public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (helper(words, board, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    private boolean helper(char[] words, char[][] board, int i, int j, int k) {
        if (k == words.length) return true;
        if (i < 0 || j< 0 || i == board.length || j == board[0].length) return false;
        if (board[i][j] != words[k] || board[i][j] == 0) return false;
        // deal with revisited node
        char temp = board[i][j];
        board[i][j] = 0;
        boolean res = (helper(words, board, i, j+1, k + 1)||
                helper(words, board, i, j-1, k + 1)||
                helper(words, board, i-1, j, k + 1)||
                helper(words, board, i+1, j, k + 1));
        board[i][j] = temp;
        return res;
    }
}
    
