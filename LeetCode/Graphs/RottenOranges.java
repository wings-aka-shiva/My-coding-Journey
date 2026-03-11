import java.util.*;

public class RottenOranges {

    public static void main(String[] args) {

        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };

        Solution sol = new Solution();

        int result = sol.orangesRotting(grid);

        System.out.println("Minutes required: " + result);
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int minute = 0;
        Queue<int[]> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges = 0;
        boolean updateTime = false;

        //Populating queue with (x,y)coordinates of all initial rotten oranges
        for(int i=0; i<rows; ++i) {
            for(int j=0; j<cols; ++j) {
                if(grid[i][j]==2)
                    queue.offer(new int[]{i, j});
                else if(grid[i][j]==1)
                    freshOranges++;
            }
        }

        //Using direction array for ease of access

        int[][] directions = new int[][] {
            //down
            {1, 0},
            //right
            {0, 1},
            //left
            {0, -1},
            //up
            {-1, 0}
        };

        //Making sure all the rotten oranges are checked if they can spread to the fresh neighbours
        while(!queue.isEmpty()) {
            //As rotting needs to spread layer by layer, We take length, as that many of oranges are already rotten and rotting spreads layer by layer around them
            int size = queue.size();
            for(int i=0; i<size; ++i) {
                int[] vertex = queue.poll();
                for(int j=0; j<directions.length; ++j) {
                    //Generating new vertex of the orange that needs to be checked
                    int r = vertex[0] + directions[j][0];
                    int c = vertex[1] + directions[j][1];
                    
                    //Check if the generated vertex is not out of bound of the provided matrix
                    if(r>=0 && c>=0 && r<rows && c<cols && grid[r][c]==1) {
                        grid[r][c]=2;
                        freshOranges--;
                        queue.offer(new int[] {r, c});
                        //Had to use this check, because there could be a case where in th elast spreading of the layers, kthe new ornages can get rotten and enter into the queue, while it has no neighbours left to rot in the next round, so, the for loops would just run not spreading the rot but in the end after the for loops, time would update, so here we are making a check that, if there is any spread, we make it true, and after the loops, we check if there was any rot spread at that minute
                        updateTime = true;
                    }
                }
            }
            if(updateTime ==  true)
                minute++;
            updateTime = false;
        }
        if(freshOranges>0)
            return -1;
        return minute;
    }
}   