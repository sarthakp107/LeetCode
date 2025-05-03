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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean rev = false;

        while(!q.isEmpty()){
            List<Integer> cList = new ArrayList<>();
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode cNode = q.poll();
                cList.add(cNode.val);
                if(cNode.left != null) q.offer(cNode.left);
                if(cNode.right != null) q.offer(cNode.right);
            }
            if(rev) Collections.reverse(cList);
                result.add(cList);
                rev = !rev;
        }

        return result;
    }
}