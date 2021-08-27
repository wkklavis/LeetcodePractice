package Demo04;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    //动态规划f(i)=max{f(i−1)+nums[i],nums[i]}
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre+nums[i],nums[i]);
            result = Math.max(result,pre);
        }
        return result;
    }
}
