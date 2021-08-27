package Demo04;

public class Jump {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }
    public static int jump(int[] nums) {
        if (nums.length==0||nums.length==1)return 0;
        else if (nums[0]>=nums.length)return 1;
        int result = 0;
        int maxRange;
        int maxPoint = 0;
        int max;
        for (int i = 0; i < nums.length; i++) {
            maxRange = i+nums[i];
            max = maxRange;
            if (maxRange>=nums.length-1)return result+1;
            for (int j = i; j <= maxRange; j++) {
                if (max<j+nums[j]) {
                    max = j + nums[j];
                    maxPoint = j;
                }
            }
            maxRange = max;
            i=maxPoint-1;
            result++;
        }
        return result+1;
    }
}
