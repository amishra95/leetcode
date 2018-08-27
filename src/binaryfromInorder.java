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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
    Arrays.sort(pre);
    
    int[] nodeArray = new int[pre.length];
        
    int begin = 0;
    int end = pre.length - 1;
        
    int mid = (begin + end)/2;
        
    nodeArray[0] = mid;
    
for(int i = 0; i < mid; i++){
    for(int j = mid; j < pre.length -1; j++){
    nodeArray[i] = pre[mid-i];
    nodeArray[j] = pre[pre.length-1-j];   
    }
}
     return nodeArray;
    }
    
   
}