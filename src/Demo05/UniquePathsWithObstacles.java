package Demo05;

public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 1},{0, 0}}));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int result = 0;
        int m = obstacleGrid.length,n=obstacleGrid[0].length;
        int[] f = new int[m*n];
        f[0]=obstacleGrid[0][0]==0?1:0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j]!=0)continue;
                if ((i)*n+j-1>=0&&(i)*n+j-1<m*n&&j!=0)f[(i)*n+j]+=f[(i)*n+j-1];
                if ((i-1)*n+j>=0&&(i-1)*n+j<m*n)f[(i)*n+j]+=f[(i-1)*n+j];
            }
        }
        return f[f.length-1];
    }
}
