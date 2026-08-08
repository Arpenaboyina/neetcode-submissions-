class Solution {
    public boolean isPalindrome(String s) {
        
        String s3=s.toLowerCase().trim();

       

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s3.length();i++)
        {
            if((s3.charAt(i) >= 'a' && s3.charAt(i) <= 'z') || (s3.charAt(i)-'0' >= 0 && s3.charAt(i)-'0' <= 9))
            {
                sb.append(s3.charAt(i));
            }
        }

        String s2=sb.toString();


    int left=0;
    int right=s2.length()-1;
       while(left < right)
       {
         if(s2.charAt(left) != s2.charAt(right)) return false;

         left++;
         right--;
       }


       return true;
    }
}
