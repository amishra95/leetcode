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
    public String smallestFromLeaf(TreeNode root) {
       if(root == null) return "|";
        
    char c = (char)('a'+root.val);
    if(root.left == null && root.right == null) return c+"";
        String L = smallestFromLeaf(root.left);
        String R = smallestFromLeaf(root.right);
        
    return (L.compareTo(R) < 0 ? L:R)+ c;
    
        
    }
    
   
    
}