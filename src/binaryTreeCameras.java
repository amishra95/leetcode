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
    int result = 0;
    
    public int minCameraCover(TreeNode root) {
       int state = helper(root);
        
        return state == 0 ? result+1: result;
}
  
private int helper(TreeNode root){
    
    if(root == null){
        return -1;
    }
    
    if(root.left == null && root.right == null){
        return 0;
    }

    int leftState = helper(root.left);
    int rightState = helper(root.right);
    
    if(leftState == 0 || rightState == 0){
        result++;
        return 2;
    }
    
    if((leftState == 1|| leftState == -1) && (rightState == 1 || rightState == -1)){
    return 0;
    }

return 1;
    
}
    

}