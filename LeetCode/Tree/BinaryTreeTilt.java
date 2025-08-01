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
    int tiltSum = 0;

    public int findTiltSum(TreeNode root) {
        if(root==null) return 0;
    
        int leftSum = 0;
        int rightSum = 0;

        leftSum += findTiltSum(root.left);
        rightSum += findTiltSum(root.right);
        tiltSum += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + root.val;
    }

    public int findTilt(TreeNode root) {
        int totalSum = findTiltSum(root);
        return tiltSum;
    }
}