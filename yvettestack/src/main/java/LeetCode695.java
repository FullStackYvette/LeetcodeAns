public class LeetCode695 {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    maxarea = Math.max(maxarea, dfs(grid,i,j));
            }
        }
        return maxarea;
    }

    public static int dfs(int[][] grid, int i, int j)
    {
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] == 1)
        {
            grid[i][j]=0;
            return 1 + dfs(grid,i-1,j) + dfs(grid,i+1,j) + dfs(grid,i,j-1) +dfs(grid, i, j+1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int map1[][] = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(maxAreaOfIsland(map1));//6

        int map2[][] = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(map2));//0
    }
}
//https://leetcode.com/problems/max-area-of-island/description/
