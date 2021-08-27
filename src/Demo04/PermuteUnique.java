package Demo04;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class PermuteUnique {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[]visited = new boolean[nums.length];
        getPermutations(nums,visited,nums.length);
        return result;
    }
    private static void getPermutations(int[] nums,boolean[] visited, int n) {
        if (r.size()==n){
            result.add(new ArrayList<>(r));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            //已经使用过该元素
            if (visited[j])continue;
            //在排好序的数组中，!visited[j-1]同级添加，往后遍历相同元素则剪枝
            if (j>0&&nums[j]==nums[j-1]&&!visited[j-1])continue;
            visited[j]=true;
            r.add(nums[j]);
            getPermutations(nums,visited, n);
            visited[j]=false;
            r.remove(r.size()-1);
        }
    }
}
