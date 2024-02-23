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
    public List<Integer> largestValues(TreeNode root) {
        return helper(root, 0, new ArrayList<Integer>());
    }

    public List<Integer> helper(TreeNode root, int level, List<Integer> ans){
        if(root != null){
            if(ans.size() == level){
                ans.add(root.val);
            }else{
                ans.set(level, Math.max(root.val, ans.get(level)));
            }
            System.out.println(root.val + " : " + level);
            ans = helper(root.left, level+1, ans);
            ans = helper(root.right, level+1, ans);
            return ans;
        }
        return ans;
    }
}