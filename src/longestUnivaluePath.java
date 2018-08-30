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
   int val;
    public int longestUnivaluePath(TreeNode root) {
      val = 0;
        helper(root);
        return val;
    }
    
    public int helper(TreeNode node){
        if(node == null)
            return 0;
        
    int left = helper(node.left);
    int right = helper(node.right);
    
        int leftVal = 0, rightVal = 0;
    
        if(node.left != null && node.left.val == node.val){
        leftVal += left + 1;
        
    }
        
        if(node.right != null && node.right.val == node.val){
            rightVal += right + 1;
        }
        val = Math.max(val, leftVal + rightVal);
        return Math.max(leftVal, rightVal);
        
    }
}