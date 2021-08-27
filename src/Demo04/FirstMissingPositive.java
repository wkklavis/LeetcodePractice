package Demo04;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        int temp;
        //hash化数组
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==i+1)continue;
            if (nums[i]<nums.length+1 && nums[i]>0 && nums[i]!=nums[nums[i]-1]){
                temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1)return i+1;
        }
        return nums.length+1;
    }
}
