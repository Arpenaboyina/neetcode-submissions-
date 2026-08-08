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
    public int kthSmallest(TreeNode root, int k) {
        
        PriorityQueue<Integer> ans=new PriorityQueue<>();

        helper(root,ans);

        while(k > 1)
        {
            ans.poll();
            k--;
        }

        return ans.peek();
    }

    public static void helper(TreeNode root,PriorityQueue<Integer> ans)
    {
        if(root == null) return ;

        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right,ans);
        
    }
}
