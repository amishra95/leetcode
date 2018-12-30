import javafx.scene.Node;

public class univaluedBinaryTree {

	public boolean uniValue(Node node) {
		
		return helper(node, node.val);
	}
	
	public boolean helper(Node node, int v) {
		if(node == null) {
			return true;
		}
		if(node.val != v) {
			return false;
		}
		
		return helper(node.left, v) && helper(node.right);
	}
	
}
