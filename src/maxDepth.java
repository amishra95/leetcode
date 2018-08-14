
public class maxDepth {

	public int maxDepth(TreeNode root) {
		int max = 0;
		
	if(root == null)
		return 0;
	if(root.left == null && root.right == null) {
		return 1;
	}
	
	max = Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    return max;
    
	}
}
