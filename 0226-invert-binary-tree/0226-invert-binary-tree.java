class Solution {

    public TreeNode invertTree(TreeNode r) {
        if(r == null){
               return r;
        }


TreeNode cleft = r.left;
        TreeNode cright = r.right;

        r.left = cright;
        r.right = cleft;
        invertTree(r.left);
        invertTree(r.right);
        return r;
    }
}