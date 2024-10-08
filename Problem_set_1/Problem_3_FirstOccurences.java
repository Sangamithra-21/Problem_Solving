package Problem_set_1;

import java.util.Scanner;

public class Problem_3_FirstOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1=sc.next();
        System.out.println("Enter String 2 : ");
        String str2=sc.next();
        int minIndex=str1.length();
        int maxIndex=0;
        for(int i=0;i<str2.length();i++)
        {
            char c=str2.charAt(i);
            for(int j=0;j<str1.length();j++)
            {
                if(str1.charAt(j)==c)
                {
                    if(minIndex>j)
                    {
                        minIndex=j;
                    }
                    if(maxIndex<j) {
                        maxIndex=j;
                        break;
                    }
                }
            }
        }
        for(int k=minIndex;k<=maxIndex;k++)
        {
            System.out.print(str1.charAt(k));
        }
    }
}
