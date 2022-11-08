package lesson_02;

public class hw_02_maxAreaOfIsland_2 {
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int[][] grid1 = {{0,0,0,0,0,0,0,0}};
        System.out.println(maxAreaOfIsland_2(grid));
        System.out.println("____________________");
        System.out.println(maxAreaOfIsland_2(grid1));
    }
    public static int maxAreaOfIsland_2(int[][] grid) {
        int maxArea = 0;
        for(int row = 0; row < grid.length; row++){
            for(int colunm = 0; colunm < grid[0].length; colunm++){
                if(grid[row][colunm] == 1){
                    maxArea = Math.max(maxArea, calculatedArea(row, colunm, grid));
                }
            }
        }
        return maxArea;
    }
    public static int calculatedArea(int row, int column, int[][] grid) {
        if (row < 0 || row >= grid.length || column < 0 ||
                column >= grid[0].length || grid[row][column] == 0) return 0;
        grid[row][column] = 0;
        return 1 + calculatedArea(row + 1, column, grid) + calculatedArea(row - 1, column, grid) +
                calculatedArea(row, column + 1, grid) + calculatedArea(row, column - 1, grid);
    }
}
