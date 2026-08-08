class Solution {
    public void solve(char[][] board) {
        
        int n=board.length;
        int m=board[0].length;

        Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i == 0 || j == 0 || i == n-1 || j == m-1) && (board[i][j] == 'O'))
                {
                    q.add(new int[]{i,j});
                    board[i][j]='#';
                }
            }
        }

        int dirs[][]={{1,0},{0,1},{-1,0},{0,-1}};

        while(!q.isEmpty())
        {
            int pair[]=q.poll();

            int x=pair[0];
            int y=pair[1];

            for(int dir[] : dirs)
            {
                int nx=x+dir[0];
                int ny=y+dir[1];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 'O')
                {
                    q.add(new int[]{nx,ny});
                    board[nx][ny]='#';
                }
            }

        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] == 'O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j] == '#')
                {
                    board[i][j]='O';
                }
            }
        }
    }
}
