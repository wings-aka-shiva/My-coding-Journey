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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int minLength = 0;

        while(!queue.isEmpty()) {
            minLength++;
            int levelLength = queue.size();
            for(int i=0; i<levelLength; ++i) {
                TreeNode polled = queue.poll();
                if(polled.left == null && polled.right == null) return minLength;
                if(polled.left != null) queue.offer(polled.left);
                if(polled.right != null) queue.offer(polled.right);
            }
        }

        return minLength;
    }
}