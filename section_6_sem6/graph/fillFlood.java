package graph;
/*
 *  Flood Fill: Use DFS or BFS to fill a region in a grid.
 */
public class fillFlood {
    // Directions: up, down, left, right
    private static final int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};

    public void floodFill(int[][] grid, int sr, int sc, int newColor) {
        int oldColor = grid[sr][sc];
        if (oldColor == newColor) return;
        dfs(grid, sr, sc, oldColor, newColor);
    }

    private void dfs(int[][] grid, int r, int c, int oldColor, int newColor) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;
        if (grid[r][c] != oldColor) return;
        grid[r][c] = newColor;
        for (int[] d : DIRS) {
            dfs(grid, r + d[0], c + d[1], oldColor, newColor);
        }
    }
}
