class Solution {
    public int NumberOfIslands(char[][] grid) {
        int islands = 0;
        if(grid.length == 0)
            return islands;
        int rows = grid.length;
        int cols = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        int[][] directions = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};
        for(int i=0; i<rows; ++i) {
            for(int j=0; j<cols; ++j) {
                if(grid[i][j] == '1') {
                    queue.offer(new int[] {i,j});
                    grid[i][j] = 0;
                    ++islands;
                    while(!queue.isEmpty()) {
                        int[] vertex = queue.poll();
                        for(int k=0; k<directions.length; ++k) {
                            int r = vertex[0]+directions[k][0];
                            int c = vertex[1]+directions[k][1];
                            if(r>=0 && r<rows && c>=0 && c<cols && grid[r][c] == '1') {
                                queue.offer(new int[] {r,c});
                                grid[r][c]='0';
                            }
                        }
                    }
                }
            }
        }
        return islands;
    }
}