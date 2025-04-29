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
    public int h(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(h(node.left), h(node.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int lh = h(root.left);
        int rh = h(root.right);

        return Math.abs(lh - rh) <=1 && isBalanced(root.left) &&isBalanced(root.right);
    }

}