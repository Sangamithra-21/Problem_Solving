package Problem_set_1;

import java.util.Scanner;

public class Problem_49_Pattern {
    public static void main(String[] args) {
        int val=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        int c=2;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            ele=val;
            for(int k=0;k<=i;k++)
            {
                System.out.print(ele-- +" ");
            }
            val=val+c;
            c=c+1;
            System.out.println();
        }
        c=c-1;
        val=val-c;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            ele=val;
            for(int k=i;k<n;k++)
            {
                System.out.print(ele-- + " ");
            }
            c=c-1;
            val=val-c;
            System.out.println();
        }
    }
}
