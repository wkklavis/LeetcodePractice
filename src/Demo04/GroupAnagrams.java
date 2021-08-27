package Demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> r = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) continue;
            if (r.size() == 0) {
                r.add(strs[i]);
                strs[i] = null;
            }
            char[] c1 = r.get(0).toCharArray();
            Arrays.sort(c1);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j] == null || strs[j].length() != r.get(0).length()) continue;
                else {
                    boolean isAdd = true;
                    char[] c2 = strs[j].toCharArray();
                    Arrays.sort(c2);
                    if (Arrays.equals(c1,c2)) {
                        r.add(strs[j]);
                        strs[j] = null;
                    }
                }
            }
            result.add(new ArrayList<>(r));
            r.clear();
        }
        if (r.size() != 0) result.add(new ArrayList<>(r));
        return result;
    }
}
