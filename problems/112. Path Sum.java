/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            if(sum == root.val)return true;
            else return false;
        }
        int subSum = sum - root.val;
        if(hasPathSum(root.left, subSum) || hasPathSum(root.right, subSum))return true;
        else return false;
    }
}