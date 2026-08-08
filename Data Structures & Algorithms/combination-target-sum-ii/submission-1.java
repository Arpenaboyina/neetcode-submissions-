

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        helper(ans,nums,target,0,new ArrayList<>());
        return ans;
    }
    

    public static void helper(List<List<Integer>> ans,int nums[],int target,int start,List<Integer>temp)
    {

         if(target == 0)
         {
            ans.add(new ArrayList<>(temp));
            return ;
         }

         if(target < 0) return ;

        for(int i=start;i<nums.length;i++)
        {
            if (i > start && nums[i] == nums[i - 1])
                continue;

            temp.add(nums[i]);
             helper(ans,nums,target-nums[i],i+1,temp);
            temp.remove(temp.size()-1);
            
        }
    }
}
