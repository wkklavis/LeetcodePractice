package Demo03;

public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
    //KMP!!!
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())return 0;
        int[]next = new int[needle.length()];
        getNext(next,needle);

        int j = 0;
        int i = 0;
        while (i<haystack.length()&&j<needle.length()){
            if (j==-1||haystack.charAt(i)==needle.charAt(j)){
                i++;j++;
            }
            else j = next[j];

        }

        return j==needle.length()?i-j:-1;

    }

    private static void getNext(int[] next, String needle) {
        next[0]=-1;
        int i = 0;
        int j = -1;

        while (i<needle.length()){
            if (j==-1||needle.charAt(i)==needle.charAt(j)){
                i++;j++;
                if (i<needle.length()&&needle.charAt(i)==needle.charAt(j))
                    next[i] = next[j];
                if (i<needle.length()&&needle.charAt(i)!=needle.charAt(j))
                    next[i] = j;
            }
            else j = next[j];

        }


    }
}
