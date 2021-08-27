package Demo03;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[]arr = new int[]{2,3,1};
        nextPermutation(arr);
        System.out.println(arr);
    }
    public static void nextPermutation(int[] nums) {
        int i = nums.length-1;
        for (; i >= 0; i--) {
            if (i-1>=0&&nums[i]>nums[i-1]) {
                i--;
                break;
            }
        }
        if (i<0){
            Arrays.sort(nums);
            return;
        }
        int k = nums.length-1;
        for (;k>i;k--){
            if (nums[k]>nums[i])break;
        }
        //exchange
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
        //逆序

        Arrays.sort(nums,i+1,nums.length);
        return;
    }
}
