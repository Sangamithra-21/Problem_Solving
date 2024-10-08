package Problem_set_1;

import java.util.Scanner;
public class Problem_19_OddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start Value : ");
        int start=sc.nextInt();
        System.out.println("Enter End value :");
        int end=sc.nextInt();
        for(int i=start;i<end;i++)
        {
            if(i%2==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}
