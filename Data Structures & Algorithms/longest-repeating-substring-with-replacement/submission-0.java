class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxvalue=0;

        int ans=0;

        int left=0;

        int dp[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
           

           dp[s.charAt(i)-'A']++;

            maxvalue=Math.max(maxvalue,dp[s.charAt(i)-'A']);

            while((i-left+1)-maxvalue > k)
            {
                dp[s.charAt(left)-'A']--;

                   left++;

            }

            ans=Math.max(ans,i - left + 1);
        }

        return ans;
    }
}
