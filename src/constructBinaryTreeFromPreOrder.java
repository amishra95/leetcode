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
        
    int preIdx;
    int inIdx;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIdx = 0;
        inIdx = 0;
        return helper(preorder, inorder, null);
        
    }
    
    
    private TreeNode helper(int[] preorder, int[] inorder, TreeNode end){
        if (inIdx > inorder.length-1 || (end != null && end.val == inorder[inIdx]))
            return null;
        
        TreeNode root = new TreeNode(preorder[preIdx++]);
        
        root.left = helper(preorder, inorder, root);
        
        inIdx++;
        
        root.right = helper(preorder, inorder, end);
        
        return root;
    }
}