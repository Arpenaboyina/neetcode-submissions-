class Solution {
    public double myPow(double x, int n) {
        
        double temp=1;

        int n1=Math.abs(n);
        for(int i=0;i<n1;i++)
        {
             temp = temp * x;
        }

        return (n > 0)? temp : 1 / temp ;    }
}
