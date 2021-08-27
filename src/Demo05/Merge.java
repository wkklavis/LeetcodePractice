package Demo05;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Merge {
    public static void main(String[] args) {
        System.out.println(merge(new int[][]{{3,5}, {0,0}, {4,4}, {0,2},{5,6},{4,5},{3,5},{1,3},{4,6},{4,6},{3,4}}));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i]==null)continue;
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[j]==null||i==j)continue;
                if (intervals[i][1]<intervals[j][0]||intervals[i][0]>intervals[j][1])continue;
                if (intervals[i][1]>=intervals[j][0]||
                    intervals[i][1]>intervals[j][1]||
                    intervals[i][0]>intervals[j][0])
                {
                    intervals[i][1] = Math.max(intervals[j][1],intervals[i][1]);
                    intervals[i][0] = Math.min(intervals[i][0],intervals[j][0]);
                    intervals[j] = null;
                }
           }
        }
        int size = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i]!=null)size++;
        }
        int [][]result = new int[size][2];
        for (int i = 0,j=0; i < intervals.length&&j<size; i++) {
            if (intervals[i]==null)continue;
            result[j][0] = intervals[i][0];
            result[j][1] = intervals[i][1];
            j++;
        }
        return result;
    }
}
