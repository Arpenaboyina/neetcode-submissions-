


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();

        helper(ans,nums,new ArrayList<>());
        return ans;
    }
    

    public static void helper(List<List<Integer>> ans,int nums[],List<Integer>temp)
    {

         if(temp.size() == nums.length)
         {
           ans.add(new ArrayList<>(temp));
           return ;
         }

         
           
           for(int i : nums){
        
            if(temp.contains(i)) continue;
            
            temp.add(i);
            helper(ans,nums,temp);
            temp.remove(temp.size()-1);
           }
            
        
    }
}

