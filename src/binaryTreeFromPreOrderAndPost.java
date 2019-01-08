
public class binaryTreeFromPreOrderAndPost {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public TreeNode constructFromPrePost(int[] pre, int[] post) {
	        
	        if(pre == null)
	            return 0;
	        if(pre == 1){
	            return node;
	        }
	        
	    }
	    
	    public int[] helper(int[] pre, int[] post){

	        int[] array = new int[pre.length+1];
	        array.fill(pre[0]);
	        
	        
	    }
	}
}
