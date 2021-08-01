package Demo01;

public class MaxArea {
    public static void main(String[] args) {
        int [] heigeht = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heigeht));
    }
    public static int maxArea(int[] height) {
        //排除未计算的情况一定比当前情况小
        int p = 0, q = height.length-1;
        int max = 0;
        while (p!=q){
            max = Math.max(max,Math.min(height[p],height[q])*(q-p));
            if (height[p]<height[q])p++;
            else q--;
        }
        return max;

    }
}
