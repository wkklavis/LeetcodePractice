package Demo05;

import java.util.Arrays;
import java.util.List;

public class SearchMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,1}},2));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==1&&matrix[0].length==1)return target==matrix[0][0];
        int i = 0;
        for(;i<matrix.length;i++){
            if (target>matrix[i][matrix[i].length-1])continue;
            else break;
        }
        if (i>=matrix.length||target<matrix[i][0]||target>matrix[i][matrix[i].length-1])return false;
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]==target)return true;
        }
        return false;
    }
}
