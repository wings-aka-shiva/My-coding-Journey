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
    public int isBalancedBST(TreeNode root) {
        if(root==null) return 0;
        
        int leftHeight = isBalancedBST(root.left);
        int rightHeight = isBalancedBST(root.right);

        if(leftHeight == -1 || rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight)+1;
    }

    public boolean isBalanced(TreeNode root) {

        if(isBalancedBST(root)==-1) return false;
        return true;
    }
}