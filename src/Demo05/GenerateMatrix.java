package Demo05;

public class GenerateMatrix {
    public static void main(String[] args) {
        generateMatrix(4);
    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n-1, up = 0, down = n-1;
        int i = 1;
        while(i<=n*n) {
            for (int j = left; j <= right; j++) {
                result[up][j] = i;
                i++;
            }
            up++;
            for (int j = up; j <= down; j++) {
                result[j][right] = i;
                i++;
            }
            right--;
            for (int j = right; j >= left&& up<= down ; j--) {
                result[down][j] = i;
                i++;
            }
            down--;
            for (int j = down; j >= up&&left<=right; j--) {
                result[j][left] = i;
                i++;
            }
            left++;

        }
        return result;
    }
}
