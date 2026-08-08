class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        
        List<List<Integer>> adj=new ArrayList<>();

        int indegree[]=new int[n];

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int pre[] : prerequisites)
        {
            int u=pre[0];
            int v=pre[1];

            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }

         int result[]=new int[n];
         int index=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            result[index++]=node;

            for(int i : adj.get(node))
            {
                indegree[i]--;
                if(indegree[i] == 0)
                {
                    q.add(i);
                }
            }
        }

        if(index != n) return new int[]{};

        return result;
    }
}
