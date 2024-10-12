package SET_4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class permutation {
    public static void main(String[] args) {

        String s = "ABCA";

        List<String> set = new ArrayList<>();

        findPermutation(new StringBuilder(), s, new boolean[s.length()], set);
        System.out.println(new HashSet<>(set));

    }

    private static void findPermutation(StringBuilder res, String s, boolean[] used, List<String> set) {
        if (res.length() == s.length()) {
            set.add(res.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (used[i]) {
                continue;
            }

            res.append(s.charAt(i));
            used[i] = true;
            findPermutation(res, s, used, set);
            used[i] = false;
            res.deleteCharAt(res.length() - 1);
        }

    }
}
