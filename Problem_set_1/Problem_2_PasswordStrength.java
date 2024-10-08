package Problem_set_1;

import java.util.Scanner;

public class Problem_2_PasswordStrength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password :");
        String str=sc.next();
        if(str.length()<8)
        {
            System.out.println("Weak");
            return;
        }
        int small=0;
        int caps=0;
        int symbols=0;
        int nos=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {
                small=1;
            }
            else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                caps = 1;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=58)
            {
                nos=1;
            }
            else
            {
                symbols=1;
            }
        }
        if(small==1 && caps==1 && symbols==1 && nos==1)
        {
            System.out.println("Strong");
        }
        else if(small==1 && caps==1 && nos==1)
        {
            System.out.println("Good");
        }
        else if(small==1 && caps==1)
        {
            System.out.println("Medium");
        }
        else {
            System.out.println("Weak");
        }

    }

}
