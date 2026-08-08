class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans=new ArrayList<>();

        helper(n,ans,"",0,0);

        return ans;
    }

    public static void helper(int n,List<String>ans,String a,int open,int close)
    {
        if(a.length() == 2*n)
        {
            ans.add(a);
            return ;
        }

        if(open < n)
        {
            helper(n,ans,a+"(",open+1,close);
        }
        if(close < open)
        {
            helper(n,ans,a+")",open,close+1);
        }
    }
}
