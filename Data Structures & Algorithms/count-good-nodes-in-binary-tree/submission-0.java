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

    int count=0;
    public int goodNodes(TreeNode root) {
        
        return goodcheck(root,Integer.MIN_VALUE);
    }

    public static int goodcheck(TreeNode root,int curmax)
    {
          if(root == null)
          {
            return 0;
          }

           int rootvalue=0;
          if(root.val >= curmax)
          {
            rootvalue=1;
          }
          curmax=Math.max(curmax,root.val);

          int left=goodcheck(root.left,curmax);
          int right=goodcheck(root.right,curmax);

          return left+right+rootvalue;

    }
}
