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
    int max = 0;
    public int height(TreeNode n){
        if(n == null){
            return 0;
        }
        int left = height(n.left);
        int right = height(n.right);
        max = Math.max(max , left + right);

        return  1 + Math.max(left,right);

    }

    public int diameterOfBinaryTree(TreeNode r) {
       height(r);
       return max;
    }
}