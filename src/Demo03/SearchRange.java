package Demo03;


public class SearchRange {
    public static void main(String[] args) {
        searchRange(new int[]{0,0,1,2,2},2);
        System.out.println(result);
    }
    static int []result = new int[]{-1,-1};
    public static int[] searchRange(int[] nums, int target) {

        binarySearch(nums,target,0,nums.length-1);
        return result;
    }

    private static void binarySearch(int[] nums, int target, int l, int r) {
        if (l>r)return;
        int mid = (l + r) / 2;
        if (nums[mid] == target) {
            if (result[0] == -1) result[0] = mid;
            else if (l < result[0]) result[0] = mid;

            if (mid > result[1]) result[1] = mid;
            binarySearch(nums, target, mid + 1, r);
            binarySearch(nums, target, l, mid - 1);
        } else if (nums[mid] < target) {
            binarySearch(nums, target, mid + 1, r);
        } else {
            binarySearch(nums, target, l, mid - 1);
        }
    }

}
