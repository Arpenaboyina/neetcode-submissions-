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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();

        find(root,ans,0);
        return ans;
    }

    public static void find(TreeNode root,List<List<Integer>> ans,int count)
    {
        if(root == null) return ;
      
        if(ans.size() == count) ans.add(new ArrayList<>());

        ans.get(count).add(root.val);
        find(root.left,ans,count+1);
        find(root.right,ans,count+1);
    }
}
