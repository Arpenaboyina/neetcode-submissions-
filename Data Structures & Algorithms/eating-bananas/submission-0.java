class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int minvalue=0;
        int maxvalue=0;

        int ans=Integer.MAX_VALUE;


        for(int i : piles){
            maxvalue=Math.max(maxvalue,i);
        }
        

        while(minvalue <= maxvalue)
        {
            int hours=0;
            int mid=minvalue+(maxvalue-minvalue)/2;

            for(int i : piles)
            {
                hours += Math.ceil((double)i/mid);
            }
            if(hours <= h)
            {
                ans=mid;
                maxvalue=mid-1;
            }
            else{
                minvalue=mid+1;
            }
        }

        return ans;
    }
}
