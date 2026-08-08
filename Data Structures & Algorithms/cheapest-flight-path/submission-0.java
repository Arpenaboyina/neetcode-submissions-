class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

       int distance[]=new int[n];
       Arrays.fill(distance,Integer.MAX_VALUE);
       distance[src]=0;
      for(int i=0;i<=k;i++)
       {
         int temp[]=distance.clone();
        for(int flight[] : flights)
        {
            int node=flight[0];
            int adjnode=flight[1];
            int dis=flight[2];

            if(distance[node] != Integer.MAX_VALUE && distance[node]+dis < temp[adjnode])
            {
               temp[adjnode]=distance[node]+dis;
            }
        }
        distance=temp;
       }

      return distance[dst] == Integer.MAX_VALUE ?-1:distance[dst]; 
    }
}
