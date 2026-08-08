class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int n=heights.length;
        int m=heights[0].length;

        List<List<Integer>> ans=new ArrayList<>();

        if(n == 0 ||m == 0) return ans;

        boolean pacific[][]=new boolean[n][m];
        boolean atlantic[][]=new boolean[n][m];

        for(int i=0;i<m;i++)
        {
            dfs(heights,0,i,Integer.MIN_VALUE,pacific);
            dfs(heights,n-1,i,Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<n;i++)
        {
            dfs(heights,i,0,Integer.MIN_VALUE,pacific);
            dfs(heights,i,m-1,Integer.MIN_VALUE,atlantic);
        }


    

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                   ans.add(List.of(i, j)); 
                }
            }
        }

        return ans;
    }

    public static void dfs(int heights[][],int i,int j,int prev,boolean visited[][])
    {
        if(i < 0 ||i >= heights.length || j < 0 || j >= heights[0].length || visited[i][j]) return ;

        if(heights[i][j] < prev) return ;

        visited[i][j]=true;

        dfs(heights,i+1,j,heights[i][j],visited);
        dfs(heights,i,j+1,heights[i][j],visited);
        dfs(heights,i-1,j,heights[i][j],visited);
        dfs(heights,i,j-1,heights[i][j],visited);
    }
}
