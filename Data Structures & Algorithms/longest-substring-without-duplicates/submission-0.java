class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set=new HashSet<>();

        int n =s.length();
        int left=0;

        int maxlength=0;

        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
             
             while(set.contains(c))
             {
                set.remove(s.charAt(left));
                left++;
             }

             set.add(c);

             maxlength=Math.max(maxlength,set.size());
        }

        return maxlength;
    }
}
