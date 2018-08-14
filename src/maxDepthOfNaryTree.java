
public class maxDepthOfNaryTree {

	public int maxDepth(Node root) {
		
		int max = 1;
		if(root == null) {
			return 0;
		}
		
	for(Node child: root.children) {
		max = Math.max(max, maxDepth(child)+1);
	}
	return max;
	}

}
