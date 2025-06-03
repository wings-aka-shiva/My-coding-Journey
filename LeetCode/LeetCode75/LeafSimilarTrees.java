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
    List<Integer> leafList1 = new ArrayList<>();
    List<Integer> leafList2 = new ArrayList<>();

    private void leafValues(TreeNode root, List<Integer> leafList) {
        if(root==null) return;
        leafValues(root.left, leafList);
        if(root.left == null && root.right == null) leafList.add(root.val);
        leafValues(root.right, leafList);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafValues(root1, leafList1);
        leafValues(root2, leafList2);
        if(leafList1.size() != leafList2.size()) {
            return false;
        }else {
            return leafList1.equals(leafList2);
        }
    }
}