package Demo03;

public class Divide {
    public static void main(String[] args) {

        System.out.println(divide(-2147483648, -1));
    }
    public static int divide(int dividend, int divisor) {
        boolean flag = (dividend>0&&divisor>0)||(dividend<0&&divisor<0);
        long dividen_l = Math.abs((long)dividend);
        long divisor_l = Math.abs((long)divisor);

        long result = 0;

        while (dividen_l>=divisor_l) {
            int multiple = 1;
            for (long i = divisor_l;i<=dividen_l;i+=i){
                multiple+=multiple;
                dividen_l-=i;
            }
            multiple--;
            result+=multiple;
        }
        result = flag?result:-result;
        if ((int)result!=result)return Integer.MAX_VALUE;
        else return (int)result;
    }

    private static int getDivide(int dividend, int divisor) {
        int multiple = 1;
        for (;divisor<dividend;divisor+=divisor){
            multiple+=multiple;
            dividend-=divisor;
        }
        return multiple-1;
    }
}
