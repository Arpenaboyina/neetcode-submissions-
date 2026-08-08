class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();

          int maxvalue=Integer.MIN_VALUE;
          int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
            maxvalue=Math.max(maxvalue,nums[i]);
            minvalue=Math.min(minvalue,nums[i]);
        }

        int count=0;
        int maxcount=0;

        for(int i=minvalue;i<maxvalue+1;i++)
        {
           if(set.contains(i))
           {
            count++;
           }
           else{
            count=0;
           }

           maxcount=Math.max(maxcount,count);


        }

        return maxcount;
    }
}
