package Dynamic_Programming_Arrays_1;

public class Knapsack_0_1 {
    public static void main(String[] args) {
        int[] weight = {3,4,5};
        int[] value = {30,50,60};

        int capacity=8;

        int val=zeroOneKnapsack(weight,value,0,capacity,0);
        System.out.println("Maximum Kanpsack Value(Recursion)  : "+val);

        int[][] dp=new int[weight.length][capacity+1];
        int val2=zeroOneKnapsackMemoization(weight,value,0,capacity,0,dp);
        System.out.println("Maximum Kanpsack Value(Memoization)  : "+val2);


        int val3=zeroOneKnapsackTabulation(weight,value,capacity);
        System.out.println("Maximum Knapsack Value(Tabulation)  : "+val3);

    }

    private static int zeroOneKnapsackTabulation(int[] weight, int[] value,int capacity) {
        int[][] dp=new int[value.length][capacity+1];

       for(int i=weight[0];i<=capacity;i++)
       {
           dp[0][i]=value[0];
       }

       for(int i=1;i<weight.length;i++)
       {
           for(int j=0;j<=capacity;j++)
           {
               int take=Integer.MIN_VALUE;
               if(j>=weight[i])
               {
                   take=value[i]+dp[i-1][j-weight[i]];
               }
               int notTake=dp[i-1][j];
               dp[i][j]=Math.max(take,notTake);
           }

       }
       return dp[weight.length-1][capacity];

    }

    private static int zeroOneKnapsack(int[] weight, int[] value,int sum, int capacity,int index) {
        if(index==weight.length)
        {
            return sum;
        }

        int notTake = zeroOneKnapsack(weight,value,sum,capacity,index+1);
        int take=0;
        if(weight[index]<=capacity)
        {
            take = zeroOneKnapsack(weight,value,sum+value[index],capacity-weight[index],index+1);
        }

        return Math.max(take,notTake);
    }

    private static int zeroOneKnapsackMemoization(int[] weight, int[] value,int sum, int capacity,int index,int[][] dp) {
        if(index==weight.length)
        {
            return sum;
        }

        if(dp[index][capacity]!=0)
        {
            return dp[index][capacity];
        }

        int notTake = zeroOneKnapsackMemoization(weight,value,sum,capacity,index+1,dp);
        int take=0;
        if(weight[index]<=capacity)
        {
            take = zeroOneKnapsackMemoization(weight,value,sum+value[index],capacity-weight[index],index+1,dp);
        }

        return dp[index][capacity]=Math.max(take,notTake);
    }
}
