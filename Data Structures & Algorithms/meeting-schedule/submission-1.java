/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals.size() <= 1) return true;

        int n=intervals.size();
        int inter[][]=new int[n][2];


        for(int i=0;i<n;i++)
        {
            inter[i][0]=intervals.get(i).start;
            inter[i][1]=intervals.get(i).end;

        }

        Arrays.sort(inter,(a,b) ->Integer.compare(a[0],b[0]));

        int start=inter[0][0];
        int end=inter[0][1];


        for(int i=1;i<n;i++)
        {
            if(inter[i][0] < end)
            {
                return false;
            }
            else{
                start=inter[i][0];
                end=inter[i][1];
            }
        }

        return true;
    }
}
