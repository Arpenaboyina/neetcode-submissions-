


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();

        helper(ans,nums,0);
        return ans;
    }
    

    public static void helper(List<List<Integer>> ans,int nums[],int start)
    {

         if(start == nums.length)
         {
            List<Integer>v=new ArrayList<>();
            for(int  i : nums)
            {
                v.add(i);
            }
            ans.add(new ArrayList<>(v));
            return ;
         }
           for(int i=start;i<nums.length;i++){
        
             sort(nums,i,start);
            
             helper(ans,nums,start+1);

            sort(nums,i,start);
           }   
    }

    public static void sort(int nums[],int i ,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

