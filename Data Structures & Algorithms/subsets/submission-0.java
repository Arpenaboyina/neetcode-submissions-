class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>ans=new ArrayList<>();
       

        helper(ans,nums,new ArrayList<>(),0);

        return ans;
    }

    public static void helper(List<List<Integer>>ans,int nums[],List<Integer>temp,int start)
    {

        ans.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            helper(ans,nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
