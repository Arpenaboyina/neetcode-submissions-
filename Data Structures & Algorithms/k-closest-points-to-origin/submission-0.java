

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        // FIX 3: Changed HashMap to TreeMap so keys (distances) are sorted automatically
        TreeMap<Integer, List<int[]>> ans = new TreeMap<>();

        for (int point[] : points) {
            int first = point[0];
            int second = point[1];
            
            int value = first * first + second * second;

            if (!ans.containsKey(value)) {
                // FIX 1: Changed .add() to .put()
                ans.put(value, new ArrayList<>());
            }

            ans.get(value).add(point);
        }

        // FIX 4: Simplified the array dimensions
        int[][] result = new int[k][];
        int index = 0;

        // FIX 2: Changed 'map.values()' to 'ans.values()'
        for (List<int[]> pointList : ans.values()) {
            for (int[] point : pointList) {
                if (index < k) {
                    result[index++] = point;
                } else {
                    return result; 
                }
            }
        }

        return result;
    }
}
