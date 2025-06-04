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
    public int maxLevelSum(TreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        Queue<TreeNode> levelSum = new LinkedList<>();
        if(root.left == null && root.right == null) return root.val;
        levelSum.offer(root);
        while(levelSum.isEmpty()==false) {
            int sumValue = 0;
            int levelLength = levelSum.size();
            for(int i=0; i < levelLength; ++i) {
                TreeNode currNode = levelSum.poll();
                sumValue += currNode.val;
                if(currNode.left != null) levelSum.offer(currNode.left);
                if(currNode.right != null) levelSum.offer(currNode.right);
            }
            level++;
            if(sumValue > maxValue) {
                maxValue = sumValue; 
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}