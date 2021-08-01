package Demo01;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
    public static boolean isPalindrome(int x) {
        if (x<0)return false;
        int m=x;
        int p;
        int y=0;
        while (m!=0){
            y = y*10+ m%10;
            m/=10;
        }
        return x==y;
    }
}
