public class Solution{
public static Node insert(Node root, int key)
	{
		// if the root is null, create a new node an return it
		if (root == null) {
			return new Node(key);
		}

		// if given key is less than the root node,
		// recurse for left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// else recurse for right subtree
		else {
			// key >= root.data
			root.right = insert(root.right, key);
		}

		return root;
	}
}