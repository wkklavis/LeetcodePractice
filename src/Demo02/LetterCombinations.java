package Demo02;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    //有待修改！！DFS回溯
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
    static String[] letter = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> result = new ArrayList<>();
    static int count;
    public static List<String> letterCombinations(String digits) {
        if (digits.length()==0)return result;
        StringBuilder current = new StringBuilder();
        int begin = 0;
        count = digits.length();
        getLetters(digits,current,begin);
        return result;
    }

    private static void getLetters(String digits, StringBuilder current, int begin) {
        if (current.length()==count) {
            result.add(current.toString());
            return;
        }

        for (; begin < letter[digits.charAt(0) - '0'].length(); begin++) {
            current.append(letter[digits.charAt(0)-'0'].charAt(begin));
            String currentDigits = digits.substring(1);
            getLetters(currentDigits,current,0);
            current.deleteCharAt(current.length()-1);
        }




    }
}
