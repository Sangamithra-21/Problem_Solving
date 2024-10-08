package Problem_set_1;

import java.util.Scanner;

public class Problem_138_MaxNumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        System.out.println("Enter arrayElements :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number of digits :");
        int k=sc.nextInt();
        int max=0;
        for(int ele : arr)
        {
            if(checkValue(ele,k))
            {
                if(max<ele)
                {
                    max=ele;
                }
            }
        }
        System.out.println("Maximum Element : "+max);
    }

    private static boolean checkValue(int ele, int k) {
        int count=0;
        while(ele>0)
        {
            count++;
            ele=ele/10;
        }
        return count==k;
    }
}
