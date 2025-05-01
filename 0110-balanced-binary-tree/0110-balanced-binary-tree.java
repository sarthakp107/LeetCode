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
       
    public int height(TreeNode n){
        if(n == null){
            return 0; 
        }
       
        return 1 + Math.max(height(n.left) , height(n.right));

    }

    public boolean isBalanced(TreeNode r){
        if(r == null){
            return true;
        }


        //for a tree to be balanced, the height of left and right should be <= 1.. abs
        //check for each node
        return Math.abs(height(r.left) - height(r.right)) <= 1 && isBalanced(r.left) &&isBalanced(r.right);
    }


}