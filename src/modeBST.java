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
   
    List<Integer> list = new ArrayList<Integer>();
    
    public int[] findMode(TreeNode root) {
      
    
        
        int mode = list[0];
        int maxCount = 0;
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                    }
                }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
        
    
    
    public List<Integer> listOfArray(TreeNode root){
        treeTravel(root);
        return list;
    }
    
   
    private void treeTravel(TreeNode node){
        if(node != null){
            treeTravel(node.left);
            list.add(node.value);
            treeTravel(node.right);
        }
        
        
    }
}