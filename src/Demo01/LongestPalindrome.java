package Demo01;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaa"));
    }
    public static String longestPalindrome(String s) {
        String result = "";
        boolean[][] table = new boolean[s.length()][s.length()];
        //length=1
        for (int i = 0; i < s.length(); i++) {
            table[i][i] = true;
            result = s.substring(i,i+1);
        }
        //length=2
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                table[i][i + 1] = true;
                result = s.substring(i,i+2);
            }
            else table[i][i+1]=false;
        }
        //length>=3
        for (int j = 2; j < s.length(); j++) {
            for (int i = 0; i +j < s.length(); i++) {

                if (s.charAt(j+i)!=s.charAt(i)) {
                    table[i][j+i] = false;
                    continue;
                }
                if (table[i+1][j+i-1]) {
                    table[i][j+i] = true;
                    //if (s.substring(i,j+i+1).length()>result.length())
                    result = s.substring(i,j+i+1);
                }
                else table[i][j+i]=false;
            }

        }
        return result;
    }
}
