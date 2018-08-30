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
   
    int maxCount ;
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
public int[] findFrequentTreeSum(TreeNode root) {
   maxCount = 0; 
    map = new HashMap<Integer, Integer>();
    
    helper(root);
    
    List<Integer> list = new ArrayList<>();
for(int key : map.keySet()){
    if(map.get(key) == maxCount){
        list.add(key);
    }
}
    
    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
        result[i] = list.get(i);
    }
    return result;
    }


public int helper(TreeNode node){
    if(node == null)
        return 0;
    
   
        
    int left = helper(node.left);
    int right = helper(node.right);
    
    int sum = node.val + left + right;  
    
    int count = map.getOrDefault(sum, 0) + 1; 
    map.put(sum, count);    
    
    maxCount = Math.max(count, maxCount);
    
    return sum;
    
    
        
        
    }
}