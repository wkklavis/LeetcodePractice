package Demo03;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        getCombination(candidates,target,0,0);
        return result;
    }

    private static void getCombination(int[] candidates, int target, int i, int sum) {
        if (sum>target)return;
        else if (sum==target){
            result.add(new ArrayList<>(r));
        }
        for (int j = i; j < candidates.length; j++) {
            sum+=candidates[j];
            r.add(candidates[j]);
            getCombination(candidates,target,j,sum);
            r.remove(r.size()-1);
            sum-=candidates[j];
        }
        return;
    }
}
