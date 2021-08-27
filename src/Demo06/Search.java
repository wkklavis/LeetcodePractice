package Demo06;

public class Search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3}, 3));
    }
    public static boolean search(int[] nums, int target) {
        if (nums.length==1)return nums[0]==target;
        int l = 0, r = nums.length-1;
        int mid;
        while (l<=r){
            mid = (l+r)/2;
            if (nums[mid]==target)return true;
            if (nums[l]==nums[mid]) {
                l++;
                continue;
            }
            else if (nums[r]==nums[mid]){
                r--;
                continue;
            }
            if (nums[mid]<=target&&target<=nums[r]){
                l=mid;
                continue;
            }
            else if (nums[mid]>=target&&target>=nums[l]){
                r=mid;
                continue;
            }
            if (nums[mid]<=nums[r]){
                r = mid-1;
            }
            else if (nums[mid]>nums[l]){
                l=mid+1;
            }

        }
        return false;
    }
}
