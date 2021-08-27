package Demo04;

import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedHashMap<Integer,Integer> r = new LinkedHashMap ();
    public static List<List<Integer>> permute(int[] nums) {
        getPermutations(nums);
        return result;
    }

    private static void getPermutations(int[] nums) {
        if (r.size()==nums.length){
            result.add(new ArrayList<>(r.values()));
        }
        for (int j = 0; j < nums.length; j++) {
            if (r.containsValue(nums[j]))continue;
            r.put(j,nums[j]);
            getPermutations(nums);
            r.remove(j,nums[j]);
        }
    }
}
