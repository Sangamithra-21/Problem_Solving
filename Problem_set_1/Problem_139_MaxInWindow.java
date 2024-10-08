package Problem_set_1;

import java.util.Scanner;

public class Problem_139_MaxInWindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        System.out.println("Enter the arrayElements :");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Window Size :");
        int w=sc.nextInt();
        for(int i=0;i<=n-w;i++)
        {
            int max=Math.max(arr[i],Math.max(arr[i+1],arr[i+2]));
            System.out.print(max+" ");
        }
    }
}
