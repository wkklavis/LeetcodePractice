package Demo02;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SolveNQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(3));
    }
    static List<List<String>> result = new ArrayList<>();
    static Hashtable<Integer,Integer> r = new Hashtable();
    public static List<List<String>> solveNQueens(int n) {
        backtracking(n,0);
        return result;
    }

    private static void backtracking(int n, int row) {
        if (row==n){
            if (r.size()==n){
                List<String> current = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    StringBuilder s = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        if (r.get(i)==j) s.append("Q");
                        else s.append(".");
                    }
                    current.add(s.toString());
                }
                result.add(current);
            }
            return;
        }

        for (int i = row; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r.containsKey(i))continue;
                if (check(i,j,n)) {
                    r.put(i, j);
                    backtracking(n, i + 1);
                    r.remove(i, j);
                }
                else continue;
            }
        }
    }

    private static boolean check(int i, int j,int n) {
        for (Integer row : r.keySet()) {
            int col = r.get(row);
            if (col==j)return false;
            if (i+j==row+col)return false;
            if (j-i==col-row)return false;
        }
        return true;
    }

}
