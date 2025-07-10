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
    int maxDiameter = 0;

    public int postOrder(TreeNode root) {
        if(root==null) return 0;

        int left = postOrder(root.left);
        int right = postOrder(root.right);

        int maxOfLeftRight = Math.max(left, right);
        maxDiameter = Math.max(maxDiameter, left + right);

        return maxOfLeftRight + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        postOrder(root);
        return maxDiameter;
    }
}