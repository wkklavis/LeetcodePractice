package Demo05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        System.out.println(insert(new int[][]{{1, 2}, {3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals==null)return new int[][]{newInterval};
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            list.add(intervals[i]);
        }
        list.add(newInterval);
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < list.size()-1; i++) {
            //if (list.get(i)==null)continue;
            if (list.get(i)[1]<list.get(i+1)[0])continue;
            else {
                list.get(i)[0] = Math.min(list.get(i)[0],list.get(i+1)[0]);
                list.get(i)[1] = Math.max(list.get(i)[1],list.get(i+1)[1]);
                list.remove(i+1);
                i--;
            }
        }
        int[][]result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
}
