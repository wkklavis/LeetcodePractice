package Demo04;

import java.util.Arrays;
import java.util.Collections;

public class Rotate {
    public static void main(String[] args) {
        int [][]arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        System.out.println(arr);
    }
    public static void rotate(int[][] matrix) {
        int temp;
        //转置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i<j){
                    temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
        //翻转
        for (int i = 0; i < matrix.length; i++) {
            int p = 0,q = matrix[i].length-1;
            while (p<q){
                temp = matrix[i][p];
                matrix[i][p] = matrix[i][q];
                matrix[i][q] = temp;
                p++;q--;
            }
        }
    }
}
