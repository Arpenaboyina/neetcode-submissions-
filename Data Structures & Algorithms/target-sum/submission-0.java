class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(nums,0,target,0);
    }

    public static int helper(int nums[],int index,int target,int sum)
    {
        if(index == nums.length )
        {
           return sum == target ?1 :0;
        }

        int left=helper(nums,index+1,target,sum+nums[index]);
        int right=helper(nums,index+1,target,sum-nums[index]);

        return left+right;
    }
}
