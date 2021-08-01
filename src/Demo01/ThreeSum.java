package Demo01;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Hashtable<Integer,Integer> hash = new Hashtable();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],i);
        }
        //List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int two = 0;
        for (int i = 0; i < nums.length-1; i++) {
            //排序后的第一个数重复无意义，跳过
            //if (i>0&&nums[i]==nums[i-1])continue;
            for (int j = i+1; j < nums.length; j++) {
                //if (j>i+1&&nums[j]==nums[j-1])continue;
                two = nums[i]+nums[j];
                if (hash.containsKey(-two)&&hash.get(-two)>j){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-two);
                    set.add(list);

                }
            }
        }
        return new ArrayList<>(set);
    }
}
