package Demo03;

import java.util.ArrayDeque;
import java.util.Queue;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if (n==1)return "1";
        int count = 0;
        StringBuilder front = new StringBuilder("1");
        StringBuilder current = new StringBuilder("");
        while (n>1){
            count = 0;
            char c = front.charAt(0);
            for (int i = 0; i < front.length(); i++) {
                if (front.charAt(i)==c)count++;
                else {
                    current=current.append(count).append(c);
                    c = front.charAt(i);
                    count = 1;
                }
            }
            //处理最后一个
            current=current.append(count).append(front.charAt(front.length()-1));
            front = new StringBuilder(current);
            current.delete(0,current.length());
            n--;
        }
        return front.toString();
    }
}
