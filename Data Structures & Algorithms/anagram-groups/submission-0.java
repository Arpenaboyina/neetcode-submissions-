class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       

        HashMap<String,List<String>>ans=new HashMap<>();


        for(int i=0;i<strs.length;i++)
        {
            char temp1[]=strs[i].toCharArray();

            Arrays.sort(temp1);

            String temp2=new String(temp1);

            if(ans.containsKey(temp2))
            {
                ans.get(temp2).add(strs[i]);
            }
            else{
                ans.put(temp2,new ArrayList<>());
                ans.get(temp2).add(strs[i]);
            }

        }

        return new ArrayList<>(ans.values());
    }
}