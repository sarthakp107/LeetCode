/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //for a binary search tree
        //ie: left node < right node

        /**
        1. check if left or right of that node has p or q -> base condition
        2. check where the parent of p and q lies        
         */
         

         if(p.val < root.val && q.val < root.val){
            //check in the left side
           return lowestCommonAncestor(root.left, p, q);
         }

         if(p.val > root.val && q.val > root.val){
            //check right of the root
            return lowestCommonAncestor(root.right, p, q);
         }

         if(p.val == root.val || q.val == root.val){
            return root;
         }
         return root;
    }
}