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
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.isEmpty() == false) {
            int count = q.size();
            for(int i=0; i<count; ++i) {
                TreeNode current = q.poll();
                if(i==0) {
                    result.add(current.val);
                }
                if(current.right != null) {
                    q.offer(current.right);
                }
                if(current.left != null) {
                    q.offer(current.left);
                }
            }
        }
        return result;
    }
}