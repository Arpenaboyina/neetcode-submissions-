class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n=temperatures.length;
        int result[]=new int[n];

        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(temperatures[i] < temperatures[j])
                {
                    result[i]=j-i;
                    break;
                }
            }
        }

        result[n-1]=0;
        return result;
    }
}
