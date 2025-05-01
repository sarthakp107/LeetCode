/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode n) {
        if(n == null){
            return n;
        }

        // if(n.left == null || n.right == null){
        //     return n;
        // }

        TreeNode cnl = n.left;
        TreeNode cnr = n.right;

        n.left = cnr;
        n.right = cnl;
        invertTree(n.left);
        invertTree(n.right);

        return n;
    }
}