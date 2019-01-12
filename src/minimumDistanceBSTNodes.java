/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class minimumDistanceBSTNodes {
    public int minDiffInBST(TreeNode root) {
    
    List<Integer> list = new ArrayList<>();
      helper(root, list);
     int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
        min = Integer.min(min, list.get(i) - list.get(i-1));
    }  
        return min;
    
    }
    
    public void helper(TreeNode root, List<Integer> list){
        if(root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
         }
    }
}