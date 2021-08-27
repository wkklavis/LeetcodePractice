package Demo06;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        backTracking(nums,0);
        return result;
    }

    private static void backTracking(int[] nums, int i) {
        result.add(new ArrayList<>(r));
        for (int j = i; j < nums.length; j++) {
            r.add(nums[j]);
            backTracking(nums,j+1);
            r.remove((Integer) nums[j]);
        }
    }
}
