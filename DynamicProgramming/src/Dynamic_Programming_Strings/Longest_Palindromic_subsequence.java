package Dynamic_Programming_Strings;

public class Longest_Palindromic_subsequence {
    public static void main(String[] args) {

        String str1 ="abcaa";
        StringBuilder rev = new StringBuilder(str1);
        String str2 = rev.reverse().toString();

        int count =Longest_Common_Subsequence.longestSubsequenceTabulation(str1,str2);
        int res=str1.length()-count;
        System.out.println("Minimum operation Make Palindrome : "+res);
    }
}
