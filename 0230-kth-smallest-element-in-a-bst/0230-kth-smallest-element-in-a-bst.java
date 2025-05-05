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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans.get(k-1);
    }

    public void dfs(TreeNode n , List<Integer> ans){

        if(n == null){
            return;
        }

        dfs(n.left, ans);
        ans.add(n.val);
        dfs(n.right, ans);
    }
}