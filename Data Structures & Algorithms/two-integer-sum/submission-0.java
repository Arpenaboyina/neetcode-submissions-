class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> temp=new HashMap<>();


        for(int i=0;i<nums.length;i++)
        {
            int helper=target-nums[i];

            if(temp.containsKey(helper))
            {
                return new int[]{temp.get(helper),i};
            }

            temp.put(nums[i],i);
        }

        return new int[]{};
    }
}
