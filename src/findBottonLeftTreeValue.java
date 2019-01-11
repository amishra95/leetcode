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
    
    public int maxDepth = Integer.MIN_VALUE;
    public int leftMost =0;
   
public int findBottomLeftValue(TreeNode root) {
    int depth = 0;
       
    helper(root, depth);
    return leftMost;
        
        
    }
    
    public void helper(TreeNode root, int depth){
        if(root == null) return;
        if(depth > maxDepth){
            maxDepth = depth;
            leftMost= root.val;
            
        }
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
}