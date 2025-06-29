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
    public void allTreePaths(TreeNode root, List<String> treePaths, StringBuilder path) {
        if(root==null) return;
        if(root.left == null && root.right == null) {
            treePaths.add(new StringBuilder(path.append(String.valueOf(root.val))).toString());
        }
        StringBuilder newPath = new StringBuilder(path.append(String.valueOf(root.val) + "->"));
        if(root.left!=null) allTreePaths(root.left, treePaths, new StringBuilder(newPath));
        if(root.right!=null) allTreePaths(root.right, treePaths, new StringBuilder(newPath));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> treePaths = new ArrayList<>();
        StringBuilder path = new StringBuilder(); 
        allTreePaths(root, treePaths, path);
        return treePaths;
    }
}