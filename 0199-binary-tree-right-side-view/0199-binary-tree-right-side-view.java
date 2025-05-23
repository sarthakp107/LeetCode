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
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i = 0 ; i < qSize ; i++){
               TreeNode cNode = q.poll();

               if(i == 0){

               ans.add(cNode.val);
               }
                

                if(cNode.right != null){
                    q.offer(cNode.right);
                }

                if(cNode.left != null){
                    q.offer(cNode.left);
                }
               
            }
        }

        return ans;
    }

}