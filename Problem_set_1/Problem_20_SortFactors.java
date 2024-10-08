package Problem_set_1;

import java.util.Arrays;

public class Problem_20_SortFactors {
    public static void main(String[] args) {
        int[] arr={8,2,3,12,16};
        int[]  fact=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            fact[i]=factors(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            int index=findMax(fact,i);
            int temp=fact[i];
            fact[i]=fact[index];
            fact[index]=temp;

            int temp1=arr[i];
            arr[i]=arr[index];
            arr[index]=temp1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int findMax(int[] fact, int i) {
        int max=fact[i];
        int index=i;
        for(int j=i+1;j<fact.length;j++)
        {
            if(max<fact[j])
            {
                max=fact[j];
                index=j;

            }
        }
        return index;
    }

    private static int factors(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        return count;
    }
}
