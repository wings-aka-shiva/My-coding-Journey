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
    List<Integer> postorderList = new ArrayList<>();
    
    public void postorderTraversalTree(TreeNode root) {
        if(root==null) return;
        postorderTraversalTree(root.left);
        postorderTraversalTree(root.right);
        postorderList.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversalTree(root);

        return postorderList;
    }
}