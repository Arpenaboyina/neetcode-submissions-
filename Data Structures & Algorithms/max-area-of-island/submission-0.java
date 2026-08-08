

class Solution {
     public int maxAreaOfIsland(int[][] grid) {
        
        int maxvalue=0;

        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1)
                {
                    
                    maxvalue=Math.max(maxvalue,helper(grid,i,j,n,m,0));
                }
            }
        }
        return maxvalue;
    }

    public static int helper(int grid[][],int i,int j,int n,int m,int count)
    {
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != 1) return 0;


        if(grid[i][j]==1)
        {
            count++;
            grid[i][j]=0;
        }

       return 1+helper(grid,i+1,j,n,m,count)+
        helper(grid,i-1,j,n,m,count)+
        helper(grid,i,j+1,n,m,count)+
        helper(grid,i,j-1,n,m,count);

        
    }
}
