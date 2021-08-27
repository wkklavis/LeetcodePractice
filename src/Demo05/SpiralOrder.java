package Demo05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2}, {3,4}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix==null||matrix.length==0||matrix[0].length==0)return result;
        int left=0,down= matrix.length-1,right= matrix[0].length-1,up = 0;
        while (left<=right&&up<=down){
            //向右
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            up++;
            //向下
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //向左
            for (int i = right; i >= left&&up<=down; i--) {
                result.add(matrix[down][i]);
            }
            down--;
            //向上
            for (int i = down; i >= up && left<=right; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}
