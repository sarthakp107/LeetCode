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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root , 0, ans);
        return ans;
    }

    public void helper(TreeNode n , int level , List<Integer> ans){
        if(n == null){
            return;
        }
        if(level == ans.size()){
            ans.add(n.val);
        }
    
        helper(n.right , level+1 , ans);
        helper(n.left , level+1, ans);

    }
}