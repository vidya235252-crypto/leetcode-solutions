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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxgain(root);
        return maxsum;
    }
    private int maxgain(TreeNode node){
        if(node==null)return 0;
        int l=maxgain(node.left);
        int r=maxgain(node.right);
        l=Math.max(l,0);
        r=Math.max(r,0);
        int pathsum=node.val+l+r;
        maxsum=Math.max(maxsum,pathsum);
        return node.val+Math.max(l,r);
    }
}