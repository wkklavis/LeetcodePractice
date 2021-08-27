package Demo04;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply("999", "999"));
    }
    public static String multiply(String num1, String num2) {
        int[] result = new int[num1.length()+num2.length()];
        int mul = 0;
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                mul = (num1.charAt(num1.length()-1-i)-'0')*(num2.charAt(num2.length()-1-j)-'0');
                result[i+j] += mul%10;
                result[i+j+1] += mul/10;
            }
        }
        int carry = 0;
        for (int i = 0; i < result.length; i++) {
            if (carry!=0){result[i]+=carry;carry=0;}
            if (result[i]<10)continue;
            else {
                carry=result[i]/10;
                result[i] = result[i]%10;
            }
        }
        StringBuilder s = new StringBuilder();
        int i = result.length-1;
        //去除前导0
        for (; i>0; i--){
            if (result[i]==0)continue;
            else break;
        }
        for (;i>=0;i--){
            s.append(result[i]);
        }
        return s.toString();
    }
}
