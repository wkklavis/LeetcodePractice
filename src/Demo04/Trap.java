package Demo04;

public class Trap {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
    public static int trap(int[] height) {
        int left = 0, right = height.length-1;
        int maxLeft = 0, maxRight = 0;
        int result = 0;
        while (left<right){
            maxLeft = maxLeft>height[left]?maxLeft:height[left];
            maxRight = maxRight>height[right]?maxRight:height[right];

            if (height[left]<height[right]){
                result += maxLeft-height[left];
                left++;
            }
            else {
                result += maxRight-height[right];
                right--;
            }
        }
        return result;
    }
}
