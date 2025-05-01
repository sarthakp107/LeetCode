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
    public boolean isIdentical(TreeNode n , TreeNode s){
        if(n == null && s == null){
            return true;
        }

        if(n == null || s == null){
            return false;
        }

        if(n.val != s.val){
            return false;
        }

        return isIdentical(n.left, s.left) && isIdentical(n.right, s.right);
    }
    public boolean isSubtree(TreeNode r, TreeNode s) {
        if(r == null){
            return false;
        }
        if(isIdentical(r,s)){
            return true;
        }

        return isSubtree(r.left, s) || isSubtree(r.right, s);
    }
}