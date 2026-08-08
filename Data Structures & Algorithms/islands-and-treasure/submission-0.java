class Solution {
     public void islandsAndTreasure(int[][] grid) {
        
        int INF=Integer.MAX_VALUE;
        int maxvalue=0;

        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 0)
                {
                    
                   helper(grid,i,j,n,m,0);
                }
            }
        }
       
    }

    public static void helper(int grid[][],int i,int j,int n,int m,int distance)
    {
        if(i < 0 || i >= n || j < 0 || j >= m ) return ;


        if(grid[i][j] == -1)
        {
            return ;
        }

        if(grid[i][j] < distance)
        {
            return ;
        }

        grid[i][j]=distance;

        helper(grid,i+1,j,n,m,distance+1);
        helper(grid,i-1,j,n,m,distance+1);
        helper(grid,i,j+1,n,m,distance+1);
        helper(grid,i,j-1,n,m,distance+1);

        
    }
}
