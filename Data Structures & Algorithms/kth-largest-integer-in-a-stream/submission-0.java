class KthLargest {

      PriorityQueue<Integer> pq=new PriorityQueue<>();
      int k;
    public KthLargest(int k, int[] nums) {

        this.k=k;
        
        for(int i : nums)
        {
            pq.add(i);
            if(pq.size() > k)
            {
                pq.remove();
            }
        }
    }
    
    public int add(int val) {

        pq.add(val);
        
        while(k < pq.size())
        {
            pq.remove();
        }

        return pq.peek();

        
    }
}
