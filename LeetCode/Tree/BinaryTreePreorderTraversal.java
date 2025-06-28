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
    List<Integer> preorderList = new ArrayList<>();
    
    public void preorderTraversalTree(TreeNode root) {
        if(root==null) return;
        preorderList.add(root.val);
        preorderTraversalTree(root.left);
        preorderTraversalTree(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preorderTraversalTree(root);

        return preorderList;
    }
}