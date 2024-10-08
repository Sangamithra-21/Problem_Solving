package Problem_set_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_143_Adding2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n1 :");
        int n1=s.nextInt();
        int[] a=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter n2 :");
        int n2=s.nextInt();
        int[] b=new int[n2];
        for(int j=0;j<n2;j++)
        {
            b[j]=s.nextInt();
        }
        int carry=0;
        int i=n1-1;
        int j=n2-1;
         List<Integer> res=new ArrayList<>();
        while(i>=0 || j>=0)
        {
            int num1=i>=0 ? a[i] : 0;
            int num2=j>=0 ? b[j] : 0;
            int val=num1+num2+carry;
            res.add(0,val%10);
            carry=val/10;

            i--;
            j--;
        }
        System.out.println(res);
    }
}
