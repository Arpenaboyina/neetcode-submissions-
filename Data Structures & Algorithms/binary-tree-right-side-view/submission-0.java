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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans=new ArrayList<>();

        view(root,ans,0);
        return ans;
    }


    public static void view(TreeNode root,List<Integer>ans,int count)
    {
        if(root == null) return ;

        if(ans.size() == count)
        {
            ans.add(root.val);
        }

        view(root.right,ans,count+1);
        view(root.left,ans,count+1);
    }
}
