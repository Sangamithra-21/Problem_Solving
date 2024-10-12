package SET_4;

import java.util.ArrayList;
import java.util.List;

public class Binary_string {
    public static void main(String[] args) {
        String s = "11010";
        int count = countValidSubstrings(s);
        System.out.println(count);
    }

    private static int countValidSubstrings(String s) {
        int n = s.length();
        int totalCount = 0;


        for (int i = 0; i < n; i++) {
            int ones = 0, zeros = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                } else {
                    zeros++;
                }

                if (ones > zeros) {
                    totalCount++;
                }
            }
        }

        return totalCount;
    }
}
