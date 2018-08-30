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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       if(root == null){
           return root;
       }
        int depthLeft = depthNode(root.left);
        int depthRight = depthNode(root.right);
        
    if(depthLeft == depthRight)
        return root;
        
            return depthLeft < depthRight ? subtreeWithAllDeepest(root.right) : subtreeWithAllDeepest(root.left); 

        
    }

    public int depthNode(TreeNode node){
       
        if(node == null){
           return 0;
       }
        
        
    return 1 + Math.max(depthNode(node.left), depthNode(node.right));
    }

    
} 