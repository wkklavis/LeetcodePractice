package Demo05;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    //Fibonacci sequence
    public static int climbStairs(int n) {
        if (n==1)return 1;
        else if (n==2)return 2;
        int[]f = new int[n+1];
        f[1]=1;f[2]=2;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i-2]+f[i-1];
        }
        return f[f.length-1];
    }
}
