package Demo03;
public class Search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1}, 1));
    }
    static int result = -1;
    public static int search(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length-1; i++) {
            if (nums[i]>nums[i+1])break;
        }
        if (target>=nums[0])binarySearch(nums,target,0,i);
        else binarySearch(nums, target, i+1, nums.length -1);
        return result;
    }
    private static void binarySearch(int[] nums, int target, int l, int r) {
        if (l>r)return;
        int mid = (l + r) / 2;
        if (nums[mid] == target) {
            result = mid;
            return ;
        } else if (nums[mid] < target) {
            binarySearch(nums, target, mid + 1, r);
        } else {
            binarySearch(nums, target, l, mid - 1);
        }

    }
}
