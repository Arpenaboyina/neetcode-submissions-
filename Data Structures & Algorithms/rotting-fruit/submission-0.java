

class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshOranges = 0;

        // Count fresh oranges and add all rotten oranges to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        // No fresh oranges
        if (freshOranges == 0) {
            return 0;
        }

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int minutes = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] current = q.poll();
                int x = current[0];
                int y = current[1];

                for (int[] dir : directions) {

                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < n &&
                        ny >= 0 && ny < m &&
                        grid[nx][ny] == 1) {

                        grid[nx][ny] = 2;
                        freshOranges--;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }

            // Increase time only if there are newly rotten oranges to process
            if (!q.isEmpty()) {
                minutes++;
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }
}