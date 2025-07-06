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

    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        Map<Integer, Integer> valCounts = new HashMap<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        int maxCount = 0;

        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            valCounts.put(temp.val, valCounts.getOrDefault(temp.val, 0) +1);

            maxCount = Math.max(maxCount, valCounts.get(temp.val));
            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
        }

        
        int maxCountElements = 0;
        for(Map.Entry<Integer, Integer> entry: valCounts.entrySet()) {
            if(entry.getValue() == maxCount)
                maxCountElements++;
        }

        int[] modeArray = new int[maxCountElements];
        int i=0;
        for(Map.Entry<Integer, Integer> entry: valCounts.entrySet()) {
            if(entry.getValue() == maxCount)
                modeArray[i++] = entry.getKey();
        }

        return modeArray;
    }
}