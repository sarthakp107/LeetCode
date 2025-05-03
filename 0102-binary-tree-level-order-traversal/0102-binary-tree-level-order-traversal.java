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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> currentList = new ArrayList<>();
            for(int i = 0 ; i < qSize ; i++){
                //remove the element
                TreeNode cNode = q.poll();
                //add that element to the list
                currentList.add(cNode.val);

                if(cNode.left != null){
                    q.offer(cNode.left);
                }
                if(cNode.right != null){
                    q.offer(cNode.right);
                }
            }
            result.add(currentList);
        }


       return result;
    }
}