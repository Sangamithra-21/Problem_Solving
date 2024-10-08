package Problem_set_1;

import java.util.Scanner;

public class Problem_1_PangramChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        String s=sc.next();
        int[] freq=new int[26];
        for(char ch : s.toCharArray())
        {
            if(ch!=' ')
            {
                freq[ch-'a']++;
            }

        }
        for(int ele : freq)
        {
            if(ele==0)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
