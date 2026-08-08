class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int alpha1[]=new int[26];
        int alpha2[]=new int[26];

        if(s1.length() > s2.length()) return false;

        int n=s1.length();
        int m=s2.length();

        for(int i=0;i<n;i++)
        {
            alpha1[s1.charAt(i)-'a']++;
            alpha2[s2.charAt(i)-'a']++;
        }

        if(check(alpha1,alpha2)) return true;

        for(int i=n;i<m;i++)
        {
            alpha2[s2.charAt(i)-'a']++;
            alpha2[s2.charAt(i-n)-'a']--;

            if(check(alpha1,alpha2)) return true;
        }

        return false;
    }

    public static boolean check(int alpha1[],int alpha2[])
    {
        for(int i=0;i<26;i++)
        {
            if(alpha1[i] != alpha2[i]) return false;
        }

        return true;
    }
}
