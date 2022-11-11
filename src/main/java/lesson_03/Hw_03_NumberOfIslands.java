package lesson_03;

public class Hw_03_NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        char[][] grid1 = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(grid));
        System.out.println("____________________");
        System.out.println(numIslands(grid1));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int colunm = 0; colunm < grid[row].length; colunm++) {
                if (grid[row][colunm] == '1') {
                    count++;
                    calculatedArea(row, colunm, grid);
                }
            }
        }
        return count;
    }

    public static int calculatedArea(int row, int column, char[][] grid) {
        if (row < 0 || row >= grid.length || column < 0 ||
                column >= grid[row].length || grid[row][column] == '0') return 0;
        grid[row][column] = '0';
        return 1 + calculatedArea(row + 1, column, grid) + calculatedArea(row - 1, column, grid) +
                calculatedArea(row, column + 1, grid) + calculatedArea(row, column - 1, grid);
    }
}
