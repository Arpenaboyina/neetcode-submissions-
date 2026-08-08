class Solution {
    public int reverse(int x) {
        
        String a=Integer.toString(Math.abs(x));

        String b="";

        for(int i=a.length()-1;i >= 0;i--)
        {
            b += a.charAt(i);
        }

      try{
        int ans=Integer.parseInt(b);

        return (x > 0)? ans :-ans;
      }
      catch(Exception e)
      {
        return 0;
      }
    }
}
