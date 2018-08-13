
public class balanceBinaryTree {
	public boolean isBalanced(TreeNode root) {
	        return dfs(root) != -1;
	    }
	    public int dfs(TreeNode root){
	        if(root == null)
	            return 0;
	        
	        int leftDepth = dfs(root.left);
	        int rightDepth = dfs(root.right);
	        
	        if(leftDepth == -1 || rightDepth ==  -1 || Math.abs(leftDepth- rightDepth) > 1)
	        { return -1;
	            }
	    
	    
	    return Math.max(leftDepth, rightDepth) + 1;
	    }
}
