package Demo01;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        //第一个字符串不断缩减处理
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)&&prefix!=""){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
