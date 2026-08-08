class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,nums,0,new ArrayList<>());
        return ans;
    }
    

    public static void helper(List<List<Integer>> ans,int nums[],int start,List<Integer> temp)
    {

        
            ans.add(new ArrayList<>(temp));
        
           for(int i=start;i<nums.length;i++){
             if (i > start && nums[i] == nums[i - 1])
                continue;
        
             temp.add(nums[i]);
            
             helper(ans,nums,i+1,temp);

             temp.remove(temp.size()-1);
           }   
    }

}

