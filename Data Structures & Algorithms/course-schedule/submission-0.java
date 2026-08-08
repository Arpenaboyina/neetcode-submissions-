class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int indegree[]=new int[numCourses];

        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int [] pairs: prerequisites){

            indegree[pairs[0]]++;
            adj.get(pairs[1]).add(pairs[0]);
        }

        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }


        while(!q.isEmpty())
        {
            int node=q.poll();

            for(int adjnodes : adj.get(node))
            {
                indegree[adjnodes]--;
                if(indegree[adjnodes] == 0)
                {
                    q.add(adjnodes);
                }
            }
        }

        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i] != 0) return false;
        }

        return true;
    }
}
