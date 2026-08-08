class Solution {
    public int leastInterval(char[] tasks, int n) {
        
       int a[]=new int[26];

       for(int i : tasks)
       {
        a[i-'A']++;
       }
       int maxvalue=0;

       for(int i : a)
       {
        maxvalue=Math.max(maxvalue,i);
       }

       int count=0;

       for(int i : a)
       {
        if(i == maxvalue)
        {
            count++;
        }
       }

       return Math.max(tasks.length,((maxvalue-1)*(n+1)+count));
    }
}
