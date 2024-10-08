package Problem_set_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Problem_17_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word :");
        String word = sc.next();
        String[] arr = {"catch", "got", "tiger", "mat", "eat", "tam", "tap", "tea"};
        List<String> result = new ArrayList<>();

        for (String s : arr) {
            if (checkAnagram(s.toLowerCase(), word.toLowerCase())) {
                result.add(s);
            }
        }
        System.out.println(result);

    }

    private static boolean checkAnagram(String s, String word) {
        int[] arr = new int[26];
        if (s.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[word.charAt(i) - 'a']--;
        }
        for (int c : arr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}

         /*
        String str1="ate";
        String str2="eat";
        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            str2=str2.replace(c,' ');
        }

        int n=str2.length();
        if(str2.equals(" ".repeat(n)))
        System.out.println("True");
      else System.out.print("false");

         */


