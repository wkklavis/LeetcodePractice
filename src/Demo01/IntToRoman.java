package Demo01;

public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {
        //贪心算法，找零钱
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        int count;
        for (int i = 0; i < values.length; i++) {
            count = num/values[i];
            for (int j = 0; j < count; j++) {
                result.append(romans[i]);
            }
            num-=count*values[i];
        }
        return result.toString();
    }
}
