package Demo03;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
    public static int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while (i<j){
            if (nums[(i+j)/2]==target)return (i+j)/2;
            else if (nums[(i+j)/2]<target) i = (i+j)/2 + 1;
            else j = (i+j)/2 - 1;
        }
        if (target>nums[i]) return i+1;
        else return i;

    }

}
