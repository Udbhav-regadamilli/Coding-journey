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
    public boolean helper(TreeNode root, int curr_sum, int targetSum){
        if(root.left == null && root.right == null){
            return root.val + curr_sum == targetSum;
        }

        boolean b1 = false, b2 = false;

        if(root.left != null) b1 = helper(root.left, curr_sum + root.val, targetSum);

        if(!b1 && root.right != null) b2 = helper(root.right, curr_sum + root.val, targetSum);

        return b1 || b2;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root, 0, targetSum);
    }
}