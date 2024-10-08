package Problem_set_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_26_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        List<Integer> res=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(checkPrime(i))
            {
                res.add(i);
            }
        }
        System.out.println(res);

    }

    private static boolean checkPrime(int i) {
        int count=0;
        for(int j=1;j<i;j++)
        {
            if(i%j==0)
            {
                count++;
                if(count==2)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
