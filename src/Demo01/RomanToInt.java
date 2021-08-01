package Demo01;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('M',1000);
        hashMap.put('D',500);
        hashMap.put('C',100);
        hashMap.put('L',50);
        hashMap.put('X',10);
        hashMap.put('V',5);
        hashMap.put('I',1);
        int result = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            result+=hashMap.get(s.charAt(i));

            if (i-1>=0){
                if (hashMap.get(s.charAt(i-1)) < hashMap.get(s.charAt(i))) {
                    result -= hashMap.get(s.charAt(i - 1));
                    i--;
                }
            }

        }
        return result;
    }
}
