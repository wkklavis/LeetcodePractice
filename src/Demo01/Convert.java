package Demo01;

public class Convert {
    public static void main(String[] args) {
        System.out.println(convert("A",1));
    }
    public static String convert(String s, int numRows) {
        if(s.length()<=2||numRows==1)return s;
        char[][] arr = new char[numRows][s.length()/2+1];
        String result= "";
        for (int i = 0; i < s.length(); i+=2*numRows-2) {
            for (int j = 0; j < numRows && j+i<s.length(); j++) {
                arr[j][i/2] = s.charAt(i+j);
            }
            for (int j = 1; j <= numRows-2 && i+numRows+j-1<s.length(); j++) {
                arr[numRows-1-j][i/2+j]=s.charAt(i+numRows+j-1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!='\u0000')result+=arr[i][j];

            }
        }
        return result;
    }
}
