package Demo04;

public class CanJump {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }
    //dynamic programming
    public static boolean canJump(int[] nums) {
        int maxStep = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i<maxStep)maxStep = Math.max(maxStep,i+nums[i]);
            if (maxStep>=nums.length-1)return true;
        }
        return false;
    }
}
