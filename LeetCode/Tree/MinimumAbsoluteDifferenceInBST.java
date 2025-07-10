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
    int minDiff = Integer.MAX_VALUE;
    
    Integer prev = null;

    public void inorder(TreeNode root) {
        if(root==null) return;

        inorder(root.left);

        if(prev != null) {
            int diff = root.val - prev;
            minDiff = Math.abs(Math.min(minDiff, diff));
        }
        prev = root.val;

        inorder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
}