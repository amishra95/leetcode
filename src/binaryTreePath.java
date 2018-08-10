
public class binaryTreePath {
	 public List<String> binaryTreePaths(TreeNode root) {

         ArrayList<String> list = new ArrayList<String>();

 
 if(root != null){
     helper("", root, list);
 }
 
return list;


}


public void helper(String curString, TreeNode node, List<String> list){


 if(node == null){
     return ;
 }
 if((node.left == null) && (node.right == null)){
     curString = curString + node.val;
     list.add(curString);
     return;
 }

 helper(curString + node.val + "->", node.left, list);
 helper(curString + node.val + "->", node.right, list);
}
}
