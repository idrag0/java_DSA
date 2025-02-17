package minCostSpanningTree;

import java.util.*;

class Solution {
    public void shortest_distance(int[][] grid) {
        int n = grid.length;
        
        // Replace -1 with a large number (infinity representation)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1)
                    grid[i][j] = 100000;
            }
        }
        
        // Floyd-Warshall Algorithm
        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = Math.min(grid[i][j], grid[i][via] + grid[via][j]);
                }
            }
        }
        
        // Convert back large values to -1 (unreachable paths)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 100000)
                    grid[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 5, -1, 10},
            {-1, 0, 3, -1},
            {-1, -1, 0, 1},
            {-1, -1, -1, 0}
        };

        Solution obj = new Solution();
        obj.shortest_distance(grid);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

