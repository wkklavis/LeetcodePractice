package Demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        getCombination2(candidates,target,0,0);
        return result;
    }
    private static void getCombination2(int[] candidates, int target, int i, int sum) {
        if (sum>target)return;
        else if (sum==target){
            result.add(new ArrayList<>(r));
        }
        for (int j = i; j < candidates.length; j++) {
            //避免重复！！！！！！！！
            if (j>i&&candidates[j]==candidates[j-1])continue;
            sum+=candidates[j];
            r.add(candidates[j]);
            getCombination2(candidates,target,j+1,sum);
            r.remove(r.size()-1);
            sum-=candidates[j];
        }
        return;
    }
}
