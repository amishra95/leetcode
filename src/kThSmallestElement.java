
public class kThSmallestElement {

	public int kthSmallest(TreeNode root, int k) {
		if(root == null || k <= 0) {
			return -1;
		}
		
	ArrayList<TreeNode> list = new ArrayList<TreeNode>();
	helper(list, root, k);
	  if (rst.size() < k) {
          return -1;
      }
      return rst.get(k - 1).val;
	}
	
	public void helper(ArrayList<TreeNode> rst, TreeNode node, int k) {
        if (rst.size() == k) {
            return;
        }
        if (node.left == null && node.right == null) {
            rst.add(node);
            return;
        }
        
        if (node.left != null) {
            helper(rst, node.left, k);
        }
        rst.add(node);
        if (node.right != null) {
            helper(rst, node.right, k);
        }
    }

	
}
