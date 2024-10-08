package Problem_set_1;

import java.util.Scanner;

public class Problem_28_SumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        System.out.println("Enter digit : ");
        int digit=sc.nextInt();
        int fact=1;
        int result=0;
        int carry=0;
        while(num>0 || carry>0)
        {
            int val=num%10+digit+carry;
            carry=val/10;
            val=val%10;
            result=result+val*fact;
            fact=fact*10;
            num=num/10;
        }
        System.out.println("Result :"+result);

    }
}
