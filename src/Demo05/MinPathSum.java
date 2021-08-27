package Demo05;

public class MinPathSum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[]f = new int[m*n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if ((i)*n+j-1>=0&&(i)*n+j-1<m*n&&j!=0&&
                        (i-1)*n+j>=0&&(i-1)*n+j<m*n) f[(i)*n+j]=Math.min(f[(i)*n+j-1],f[(i-1)*n+j])+grid[i][j];
                else if ((i)*n+j-1>=0&&(i)*n+j-1<m*n&&j!=0) f[(i)*n+j] = f[(i)*n+j-1]+grid[i][j];
                else if ((i-1)*n+j>=0&&(i-1)*n+j<m*n) f[(i)*n+j] = f[(i-1)*n+j]+grid[i][j];
                else f[(i)*n+j] = grid[i][j];
            }
        }
        return f[f.length-1];
    }
}
