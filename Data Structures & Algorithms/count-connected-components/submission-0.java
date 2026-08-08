class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int edge[] : edges)
        {
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;

        boolean visited[]=new boolean[n];

        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                helper(adj,i,visited);
            }
        }

        return count;

    }

    public static void helper(List<List<Integer>> adj,int node,boolean visited[])
    {
        visited[node]=true;

        for(int i : adj.get(node))
        {
            if(!visited[i])
            {
                helper(adj,i,visited);
            }
        }

    }
}
