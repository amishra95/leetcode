
public class lowestCommonAncestor {

	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		
		if(root==null||root==p||root==q) {
            return root;
        } 
        TreeNode left, right;
        left = lowestCommonAncestor(root.left,p,q);
        right = lowestCommonAncestor(root.right, p, q);
        if((left==p && right==q ) || (left==q&&right==p)) {
            return root;
        }
        return left==null?right:left;
	}
}
