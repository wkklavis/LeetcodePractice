package Demo06;

public class SortColors {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
    public static void sortColors(int[] nums) {
        int[]count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]){
                case 0:count[0]++;break;
                case 1:count[1]++;break;
                case 2:count[2]++;break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[0]>0){
                nums[i]=0;
                count[0]--;
            }
            else if (count[1]>0){
                nums[i]=1;
                count[1]--;
            }
            else if (count[2]>0){
                nums[i]=2;
                count[2]--;
            }
        }

    }
}
