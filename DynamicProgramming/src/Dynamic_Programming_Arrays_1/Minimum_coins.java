package Dynamic_Programming_Arrays_1;

public class Minimum_coins {
    public static void main(String[] args) {
        int[] coins={1,2,3};
        int target=7;

        int val1=minimumCoins(coins,target,coins.length-1);
        System.out.println("Minimum Coins (Recursion) : "+val1);


        int[][] dp=new int[coins.length][target+1];
        int val2=minimumCoinsMemoization(coins,target,coins.length-1,dp);
        System.out.println("Minimum Coins (Memoization) : "+val2);


        int val3=minimumCoinsTabulation(coins,target);
        System.out.println("Minimum Coins (Tabulation) : "+val3);



    }

    private static int minimumCoinsTabulation(int[] coins, int target) {
        int n = coins.length;
        int[][] dp = new int[n][target + 1];


        for (int i = 0; i <= target; i++) {
            if (i % coins[0] == 0) {
                dp[0][i] = i / coins[0];
            } else {
                dp[0][i] = Integer.MAX_VALUE;
            }
        }


        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                int notTake = dp[i - 1][j];
                int take = Integer.MAX_VALUE;
                if (j >= coins[i]) {
                    take = 1 + dp[i][j - coins[i]];
                }
                dp[i][j] = Math.min(take, notTake);
            }
        }

        return dp[n - 1][target];
    }


    private static int minimumCoinsMemoization(int[] coins, int target, int i,int[][] dp) {
        if(i==0)
        {
            if(target%coins[0]==0)
            {
                return target/coins[0];
            }
            return Integer.MAX_VALUE;
        }

        if(dp[i][target]!=0)
        {
            return dp[i][target];
        }

        int notTake = minimumCoinsMemoization(coins,target,i-1,dp);
        int take=Integer.MAX_VALUE;

        if(coins[i]<=target)
        {
            take=1+minimumCoinsMemoization(coins,target-coins[i],i,dp);
        }
        return dp[i][target]=Math.min(take,notTake);
    }

    private static int minimumCoins(int[] coins, int target, int i) {

        if(i==0)
        {
           if(target%coins[0]==0)
           {
                return target/coins[0];
           }
           else {
               return Integer.MAX_VALUE;
           }

        }

        int notTake=minimumCoins(coins,target,i-1);
        int take=Integer.MAX_VALUE;
        if(target>=coins[i])
        {
            take=1+minimumCoins(coins,target-coins[i],i);
        }
        return Math.min(take,notTake);
    }
}
