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
    public int goodNodes(TreeNode root) {
        //root is always a good node
        return helper(root, root.val);
        
    }

    //check for the node greater thanprev node and the root if true -> count + 1;
    //if the node is the max value between the path count + 1

    public int helper(TreeNode n , int mv){
        int res = 0;
        if(n == null){
            return 0;
        }
        if(n.val >= mv){
            res = 1;
            mv = Math.max(n.val,mv);
        }

        res += helper(n.left , mv);
        res += helper(n.right , mv);
        return res;

    }
}