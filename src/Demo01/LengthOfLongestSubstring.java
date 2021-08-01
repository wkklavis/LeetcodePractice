package Demo01;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        char [] arrs = s.toCharArray();
        int left = 0 ,right = 0;
        int maxLength = 0;
        for (; right < arrs.length; right++) {
            for (int i = left;i<right;i++){
                if (arrs[right]== arrs[i]){left=i+1;continue;}
            }
            maxLength = Math.max(maxLength ,right-left+1);
        }
        return maxLength;
    }

}
