package Demo02;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 3, 3, 2}, 2));
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length==0||(nums.length==1&&nums[0]==val))return 0;
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val)continue;
            else {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}
