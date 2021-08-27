package Demo06;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> r = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        getCombination(n,k,1);
        return result;
    }

    private static void getCombination(int n, int k, int i) {
        if (r.size()==k) {
            result.add(new ArrayList<>(r));
            return;
        }
        for (Integer j = i; j <= n; j++) {
            r.add(j);
            getCombination(n,k,j+1);
            r.remove(j);
        }
    }
}
