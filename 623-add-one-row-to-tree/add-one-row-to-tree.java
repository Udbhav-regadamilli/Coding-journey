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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode head = new TreeNode(val, root, null);
            return head;
        }
        if(depth == 2){
            TreeNode temp = root.left;
            root.left = new TreeNode(val, temp, null);
            temp = root.right;
            root.right = new TreeNode(val, null, temp);
            return root;
        }
        if(root.left != null){
            addOneRow(root.left, val, depth-1);
        }
        if(root.right != null){
            addOneRow(root.right, val, depth-1);
        }
        return root;
    }
}