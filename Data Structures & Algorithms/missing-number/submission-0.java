class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int sum=0;

        int total=0;

        for(int i=0;i<n;i++)
        {
            total += nums[i];
        }
        sum=(n*(n+1))/2;

        return sum-total;
    }
}
