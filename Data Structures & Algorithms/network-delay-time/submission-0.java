class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int distance[]=new int[n+1];

         Arrays.fill(distance,Integer.MAX_VALUE);

         distance[k]=0;
         

         List<List<int[]>>adj=new ArrayList<>();

         for(int i=0;i<=n;i++)
         {
            adj.add(new ArrayList<>());
         }

         for(int time[] : times)
         {
            adj.get(time[0]).add(new int[]{time[1],time[2]});
         }
         PriorityQueue<int[]>pq=new PriorityQueue<>((a,b) -> a[1] -b[1]);

         pq.add(new int[]{k,0});

         while(!pq.isEmpty())
         {
            int pair[]=pq.poll();
            int node=pair[0];
            int dist=pair[1];

            for(int temp[] : adj.get(node))
            {
                int adjnode=temp[0];
                int newdist=temp[1];

                if(distance[node]+newdist < distance[adjnode])
                {
                    distance[adjnode]=distance[node]+newdist;
                    pq.add(new int[]{adjnode,distance[adjnode]});
                }
            }

         }

         int mintime=0;

         for(int i=1;i<=n;i++)
         {
            if(distance[i] == Integer.MAX_VALUE) return -1;

            mintime=Math.max(mintime,distance[i]);
         }

         return mintime;
    }
}


// times = [[1,2,1],[2,3,1],[1,4,4],[3,4,1]], n = 4, k = 1

/*
       
       
    src node=1
*/
