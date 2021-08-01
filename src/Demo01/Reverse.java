package Demo01;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
    public static int reverse(int x) {
        long l =0 ;
        int m = 0;
        while (x!=0){
            m = x%10;
            x = x/10;
            l = l*10 + m;

        }
        System.out.println(l);
        if ((int)l == l)return (int)l;//转换后仍在int范围内
        else return 0;

    }
}
