package Dynamic_Programming_Arrays_1;

public class Unbounded_Knapsack {
    public static void main(String[] args) {

        int[] weight={6};
        int[] values={5};

        int capacity = 10;

        int val1=knapsackRecursion(weight,values,capacity,weight.length-1);
        System.out.println("Recursion : "+val1);

        int[][] dp=new int[weight.length][capacity+1];
        int val2=knapsackRecursionMemoization(weight,values,capacity,dp,0);
        System.out.println("Memoization : "+val2);


        int val3=knapsackTabulation(weight,values,capacity);
        System.out.println("Tabulation : "+val3);
    }

    private static int knapsackTabulation(int[] weight, int[] values, int capacity) {

        int[][] dp=new int[weight.length][capacity+1];
        for(int i=weight[0];i<=capacity;i++)
        {
            dp[0][i]=values[0];
        }

        for(int i=1;i<weight.length;i++)
        {
            for(int j=0;j<=capacity;j++)
            {
                int take=Integer.MIN_VALUE;
                if(weight[i]<=j)
                {
                    take=values[i]+dp[i][j-weight[i]];
                }
                int notTake=dp[i-1][j];

                dp[i][j]=Math.max(take,notTake);
            }
        }
        return dp[weight.length-1][capacity];
    }

    private static int knapsackRecursionMemoization(int[] weight, int[] values, int capacity, int[][] dp,int i) {

        if(i==weight.length-1)
        {
            if(capacity>=weight[i]) {
                return (capacity/weight[i])*values[0];
            }
            else return Integer.MIN_VALUE;
        }
        if(dp[i][capacity]!=0)
        {
            return dp[i][capacity];
        }

        int take=Integer.MIN_VALUE;
        if(capacity>=weight[i])
        {
            take=values[i]+knapsackRecursion(weight,values,capacity-weight[i],i);
        }
        int notTake=knapsackRecursion(weight,values,capacity,i+1);

        return dp[i][capacity]=Math.max(take,notTake);
    }

    private static int knapsackRecursion(int[] weight, int[] values, int capacity, int i) {

        if(i==0)
        {
            if(capacity>=weight[i]) {
                return (capacity/weight[0])*values[0];
            }
            else return Integer.MIN_VALUE;
        }

        int take=Integer.MIN_VALUE;
        if(capacity>=weight[i])
        {
            take=values[i]+knapsackRecursion(weight,values,capacity-weight[i],i);
        }
        int notTake=knapsackRecursion(weight,values,capacity,i-1);

        return Math.max(take,notTake);
    }

}
