class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left=0;
        int right=matrix.length-1;
        int end=matrix[0].length-1;
        int row=-1;

        while(left <= right)
        {
            int mid=left+(right-left)/2;

            

            if(matrix[mid][end] >= target)
            {
                   row=mid;
                   right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        // System.out.println(row);

        if(row == -1) return false;

        int i=0;
        int j=matrix[0].length-1;

        while(i <= j)
        {
            int mid=i+(j-i)/2;

            if(matrix[row][mid] == target) return true;

            if(matrix[row][mid] > target)
            { 
                   j=mid-1;
            }
            else{
                i=mid+1;
            }

        }

        return false;
    }
}
