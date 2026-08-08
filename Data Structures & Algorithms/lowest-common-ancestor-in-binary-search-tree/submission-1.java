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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;

        if(Math.min(p.val,q.val) <= root.val && root.val <= Math.max(p.val,q.val))
        {
            return root;
        }

        if(root.val >= p.val)
        {
            return lowestCommonAncestor(root.left,p,q);
        }

        return lowestCommonAncestor(root.right,p,q);

    }
}
