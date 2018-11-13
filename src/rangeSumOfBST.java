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
   
     int count;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
      count = 0;
        helper(root, L, R);
        return count;
    }
    
    public void helper(TreeNode node, int L, int R){
        if(node != null){
            if(L <= node.val && node.val <= R)
                count += node.val;
            if(L < node.val)
                helper(node.left, L, R);
            if(node.val < R)
                helper(node.right, L, R);
        }

    }
    
    

}