package Demo01;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{0, 1, 2}, 0));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = -10000 ;
        for (int i = 0; i < nums.length; i++) {
            if (i>0&&nums[i]==nums[i-1])continue;
            int l = i+1, r = nums.length-1;
            while (l<r){
                if(Math.abs(target-(nums[l]+nums[r]+nums[i]))<=Math.abs(best-target))
                    best = nums[l]+nums[r]+nums[i];
                if(nums[l]+nums[r]+nums[i]==target)return target;
                else if (nums[l]+nums[r]+nums[i]<target)l++;
                else r--;
            }

        }
        return best;
    }
}
