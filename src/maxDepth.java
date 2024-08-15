
public class maxDepth {

	public int maxDepth(TreeNode root) {
		int max = 0;
	if(root == null)
		return 0;
	if(root.left == null && root.right == null) {
		return 1;
	}
	// recursive tool to loop through an entire left node and right node of a Binary Tree in java
	max = Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    return max;
    
	}
}

// Solution 2;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {


int max = 0;
            if(root == null){
                return 0;
            }

        int leftSum = maxDepth(root.left);
        int rightSum = maxDepth(root.right);

        max = Math.max(leftSum, rightSum);

        return max+1;

    }
}
