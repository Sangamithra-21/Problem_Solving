package Problem_set_1;

import java.util.Scanner;

public class Problem_12_RemovePalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res=new StringBuilder();
        String[] arr = str.split(" ");
        for(String s : arr)
        {
            if(!checkPalindrome(s))
            {
                res.append(s+ " ");
            }
        }
        System.out.println("Result : "+res);

    }

    private static boolean checkPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;

    }

}
