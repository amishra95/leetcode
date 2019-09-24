
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
