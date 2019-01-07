public class Solution{  

private void helper( List<Integer> list, Node root ) {
        if( root==null ) return;
        list.add( root.val );
        for( Node child: root.children ) helper( list, child );
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        helper( list, root );
        return list;
    }
}