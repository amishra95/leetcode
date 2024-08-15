class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
    }
    public TreeNode search(TreeNode root,int val)
    {
        if(root==null || root.val==val)
        return root;
        if(val<root.val)
        return search(root.left,val);
        else
        return search(root.right,val);
    }
}
