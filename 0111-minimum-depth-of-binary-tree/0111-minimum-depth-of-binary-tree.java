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
    public int minDepth(TreeNode n){
        if(n == null){
            return 0;
        }
        //if root is not empty then the depth will be atleast 1.
        if(n.left == null){
            return 1 + minDepth(n.right);
        }

        if(n.right == null){
            return 1 + minDepth(n.left);
        }
        return 1 + Math.min(minDepth(n.left), minDepth(n.right));
    }
}
       