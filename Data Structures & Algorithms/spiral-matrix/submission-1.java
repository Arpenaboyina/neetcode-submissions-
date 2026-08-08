class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans=new ArrayList<>();

        int left=0;
        int right=matrix[0].length-1;

        int up=0;
        int down=matrix.length - 1;

        //i=left to right
        //j=up to down
        //k=left to right
        //l=down to up

        while(up <= down && left <= right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[up][i]);
            }
            up++;

            for(int j=up;j<=down;j++)
            {
                ans.add(matrix[j][right]);
            }
            right--;

            if(up <= down){

            for(int k=right;k>=left;k--)
            {
                ans.add(matrix[down][k]);
            }

            down--;
            }

            if(left <= right){

            for(int l=down;l>=up;l--)
            {
                ans.add(matrix[l][left]);
            }
            left++;
            }

        }

        return ans;
    }
}
