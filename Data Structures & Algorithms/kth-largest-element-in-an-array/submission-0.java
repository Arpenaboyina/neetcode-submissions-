class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();

        for(int i : nums)
        {
            pq.add(i);

            while(pq.size() > k)
            {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
