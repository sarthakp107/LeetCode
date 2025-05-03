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
    public boolean isMirror(TreeNode ln , TreeNode rn ){
        if(ln == null && rn == null){
            return true;
        }
        if(ln == null || rn == null){
            return false;
        }
        if(ln.val == rn.val){
            // return true;
            return isMirror(ln.left, rn.right) && isMirror(ln.right , rn.left);
        }
        return false;
           
         
    }
    public boolean isSymmetric(TreeNode r) {
        if(r == null){
            return true;
        }

            return isMirror(r.left, r.right);
        
        
    }
}