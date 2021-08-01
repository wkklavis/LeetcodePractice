package Demo01;

public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }
    public static int myAtoi(String s) {
        char[] arr = s.toCharArray();
        boolean flag = true;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' ')p++;
            else break;
        }

        if (p<arr.length&&arr[p]=='-') {
            flag = false;
            p++;
        }
        else if (p<arr.length&&arr[p]=='+')p++;

        for (;p<arr.length;p++){
            if (arr[p]=='0')continue;
            else break;
        }
        if (arr.length==0||p>=arr.length||arr[p]<'0'||arr[p]>'9')return 0;

        String result="";
        for (; p < arr.length; p++) {
            if (arr[p]>='0'&&arr[p]<='9')result+=arr[p];
            else break;
        }
        double d = Double.parseDouble(result);
        if (flag){
            if ( (int)d != d)return (int)(Math.pow(2,31)-1);
            else return (int)d;
        }
        else {
            if ((int)d!=d)return (int)(-Math.pow(2,31));
            else return -(int)d;

        }

    }
}
