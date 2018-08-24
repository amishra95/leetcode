class Leetcode {
    public TreeNode invertTree(TreeNode root) {
        if(null==root)
            return root;
        
        TreeNode invertedLeft=invertTree(root.left);
        TreeNode invertedRight=invertTree(root.right);
        
        
        root.left=invertedRight;
        root.right=invertedLeft;
        
        return root;
    }
}
