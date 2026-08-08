class Solution {
    public int countSubstrings(String s) {
        
        int ans=0;
        int n=s.length();

        
        for(int i=0;i<n;i++)
        {

            //odd
            int left=i;
            int right=i;

            while(left >= 0 && right <n && s.charAt(left) == s.charAt(right))
            {
                ans ++;
                left--;
                right++;
            }

             //even
            left=i;
            right=i+1;

            while(left >= 0 && right <n && s.charAt(left) == s.charAt(right))
            {
                ans ++;
                left--;
                right++;
            }
        }

        return ans;


    }
}
