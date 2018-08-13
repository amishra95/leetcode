
public class leftLeafSum {

	
	    public int sumOfLeftLeaves(TreeNode root) {
	        return helper(root, false);
	    }
	    
	    private int helper(TreeNode root, boolean isLeft){
	        if(root == null) return 0;
	        /*This node is a leaf, if it's a left leaf, we return the value
	          if it's a right leaf we return 0 since right leaf doesn't count*/
	        if(root.left == null && root.right == null){
	            if(isLeft){
	                return root.val;
	            }
	            return 0;
	        }
	        return helper(root.left, true) + helper(root.right, false);
	    }    
	    
	}

