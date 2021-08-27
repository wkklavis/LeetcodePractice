package Demo02;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        getParenthesis(result,0,0,n,s);
        return result;
    }

    private static void getParenthesis(List<String> result, int l, int r, int n, StringBuilder s) {
        if (l==r&&l+r==2*n){
            result.add(new String(s));
            return;
        }
        if (l<r)return;
        if (l<n){
            s.append("(");
            getParenthesis(result,l+1,r,n,s);
            s.deleteCharAt(s.length()-1);
        }
        if (l>r){
            s.append(")");
            getParenthesis(result,l,r+1,n,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
