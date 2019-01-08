import java.util.Set;

public class twoSumInputBST {
	
	public boolean findTarget(TreeNode root, int k) {
		if(root == null) {
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		return helper(root, set, k);
	}
	
	public boolean helper(TreeNode node, Set<Integer> set, int k) {
		if(node == null) {
			return false; 
		}
		
		if(set.contains(k-node.val)) return true;
		
		set.add(node.val);
		return helper(node.left, set, k) || helper(node.right, set, k);
		
	}

}
