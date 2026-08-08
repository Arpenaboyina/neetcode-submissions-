class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n=intervals.length;
      
        int[][] updated = new int[n + 1][2];

        for(int i=0;i<n;i++)
        {
             updated[i]=intervals[i];
        }
        updated[n]=newInterval;

        Arrays.sort(updated,(a,b) -> Integer.compare(a[0],b[0]));

      

        List<int[]> ans=new ArrayList<>();

        int start=updated[0][0];
        int end=updated[0][1];

        for(int i=1;i<n+1;i++)
        {
            

             if(updated[i][0] <= end)
             {
                end=Math.max(end,updated[i][1]);
             }

             else{
                ans.add(new int[]{start,end});

                start=updated[i][0];
                end=updated[i][1];
             }
        }

        ans.add(new int[]{start,end});


        return ans.toArray(new int[ans.size()][]);
    }
}
