/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */ 

 // helper function and main solution which is available. 
class Solution {
    private int maxSum = 0;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
        
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
    
    int left = Math.max(helper(root.left), 0);
    int right = Math.max(helper(root.right), 0);

    maxSum = Math.max(maxSum, root.val+ left + right);
    
    return root.val + Math.max(left, right);



    }
    
    
}
