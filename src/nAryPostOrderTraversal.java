/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
   
    private void helper(List<Integer> list, Node root){
        if(root == null) return;

        for(Node child: root.children) helper(list, child);
        list.add(root.val);        
    }
    
    public List<Integer> postorder(Node root) {
        
        List<Integer> list = new ArrayList<Integer>();
        helper(list, root);
        return list;
        
    }
}