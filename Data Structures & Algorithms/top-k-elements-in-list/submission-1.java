class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length < k) return new int[]{};
        HashMap<Integer,Integer> map=new HashMap<>();

          for(int i=0;i<nums.length;i++)
          {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }

          PriorityQueue<Integer>p=new PriorityQueue<>((a,b)->(map.get(a)-map.get(b)));

          for(Map.Entry<Integer,Integer> e : map.entrySet())
          {
            p.offer(e.getKey());

            if(p.size() > k)
            {
                p.poll();
            }
          }

          int an[]=new int[k];

          for(int i=0;i<k;i++)
          {
            an[i]=p.peek();
            p.poll();
          }

          return an;

          

    }
}
