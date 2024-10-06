package Dynamic_Programming_Strings;

public class Minimum_operations_Make_strings_same {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "anc";

        int count = Longest_Common_Subsequence.longestSubsequenceTabulation(str1,str2);
        int insertion = str2.length()-count;
        int deletion = str1.length()-count;
        System.out.println("Minimum Number of Operations to Make two strings same : "+(insertion+deletion));

    }
}
