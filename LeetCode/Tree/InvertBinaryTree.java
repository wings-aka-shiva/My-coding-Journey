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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> invertedTree = new ArrayDeque<>();
        if(root!=null) invertedTree.offer(root);
        while(!invertedTree.isEmpty()) {
            TreeNode polledNode = invertedTree.poll();
            TreeNode tempLeftNode = polledNode.left;
            polledNode.left = polledNode.right;
            polledNode.right = tempLeftNode;
            if(polledNode.left != null) invertedTree.offer(polledNode.left);
            if(polledNode.right != null) invertedTree.offer(polledNode.right);
        }
        return root;
    }
}