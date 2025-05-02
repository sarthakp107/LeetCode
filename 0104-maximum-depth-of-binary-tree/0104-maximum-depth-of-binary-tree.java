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
    public int maxDepth(TreeNode r) {
           if(r == null){
            return 0;
        }

        if(r.left == null && r.right == null){
            return 1;
        }


        return 1 + Math.max(maxDepth(r.left), maxDepth(r.right));
    }
    
}