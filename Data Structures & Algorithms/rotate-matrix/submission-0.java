class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j > i)
                {
                    swap(matrix,i,j);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            reverse(matrix,i);
        }
    }

    public static void swap(int matrix[][],int i,int j)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public static void reverse(int matrix[][],int j)
    {
        int n=matrix.length;
        for(int i=0;i < n/2 ;i++)
        {
            int temp=matrix[j][i];
            matrix[j][i]=matrix[j][n-i-1];
            matrix[j][n-i-1]=temp;
        }
    }
}
