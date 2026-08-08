class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set=new HashSet<>();
        
        
        while(n > 0)
        {
            int sum=0;
            while(n > 0)
            {
                int lastdigit=n%10;
                sum += (lastdigit*lastdigit);
                n=n/10;
            }
            
            if(sum == 1) return true;
            
            if(set.contains(sum)) break;

            set.add(sum);
            n=sum;
        }
        return false;
    }
}
