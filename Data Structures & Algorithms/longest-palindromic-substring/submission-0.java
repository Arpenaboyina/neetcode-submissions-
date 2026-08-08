class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();

        int maxvalue=Integer.MIN_VALUE;

        String ans="";

        for(int i=0;i<n;i++)
        {
            //odd
            int left=i;
            int right=i;

            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right))
            {
              
            if(right-left+1 > maxvalue)
            {
                maxvalue=right-left+1;
                ans=s.substring(left,right+1);
            }
             left--;
            right++;
            
            }

            left=i;
            right=i+1;
          while(left >= 0 && right < n && s.charAt(left) == s.charAt(right))
            {
               
            if(right-left+1 > maxvalue)
            {
                maxvalue=right-left+1;
                ans=s.substring(left,right+1);
            }
             left--;
            right++;
            
            }




        }

        return ans;
    }
}
