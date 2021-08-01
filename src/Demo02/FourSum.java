package Demo02;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{-1, 0, -2, -2, -4, 0, 1, -2}, -9));
    }

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    static Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    static int sum = 0;

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            hashtable.put(i, nums[i]);
        }
        dfs(nums, target, 0);
        return result;
    }

    private static void dfs(int[] nums, int target, int begin) {
        if (r.size() == 4) {
            if (target == sum) result.add(new ArrayList<>(r));
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            if (nums.length - i < 4 - r.size()) return;//要的比给的多
            if (i > begin && nums[i] == nums[i - 1]) continue;//去重
            if (i + 1 < nums.length && sum + nums[i] + nums[i + 1] * (3 - r.size()) > target) return;
            if (sum + nums[i] + nums[nums.length - 1] * (3 - r.size()) < target) continue;

            if (r.size() == 3) {
                if (target > 0 && sum > target) return;
                if (!hashtable.containsValue(target - sum)) return;
            }
            r.add(nums[i]);//做选择
            sum += nums[i];
            dfs(nums, target, i + 1);//i+1!!!!!!!!!
            r.remove(r.size() - 1);//撤销选择
            sum -= nums[i];
        }
    }
}
