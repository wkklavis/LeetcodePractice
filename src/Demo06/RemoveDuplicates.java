package Demo06;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0)return 0;
        int count = 0;
        int i = 0;
        int j = 0;
        for (; i < nums.length; i++) {
            if (count<2){
                nums[j]=nums[i];
                j++;
                count++;
            }
            if (i+1<nums.length&&nums[i]<nums[i+1])count=0;
        }
        return j;
    }
}
