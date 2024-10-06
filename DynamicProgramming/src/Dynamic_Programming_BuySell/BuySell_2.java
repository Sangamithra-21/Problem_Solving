package Dynamic_Programming_BuySell;

public class BuySell_2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = BuySell_2(prices,0,true,0);
        System.out.println("Profit (Recursion) : "+maxProfit);


        int[][] dp=new int[prices.length][2];
        int profit1=BuySell_2_Memoization(prices,0,1,dp,0);
        System.out.println("Profit (Memoization) : "+profit1);
    }

    private static int BuySell_2_Memoization(int[] prices,int i,int buy, int[][] dp,int profit) {

        if(i==prices.length)
        {
            return 0;
        }

        if(dp[i][buy]!=0)
        {
            return dp[i][buy];
        }

        if(buy==1)
        {
            profit=dp[i][buy] = Math.max(-1*prices[i] + BuySell_2_Memoization(prices,i+1,0,dp,profit) , BuySell_2_Memoization(prices,i+1,1,dp,profit));
        }
        else {
            profit=dp[i][buy] = Math.max(prices[i] + BuySell_2_Memoization(prices,i+1,1,dp,profit) , BuySell_2_Memoization(prices,i+1,0,dp,profit));
        }
        return dp[i][buy]=profit;

    }

    public static int BuySell_2(int[] prices, int i, boolean buy,int profit)
    {
        if(i==prices.length)
        {
            return 0;
        }

        if(buy)
        {
            profit=Math.max(-1*prices[i] + BuySell_2(prices,i+1,false,profit) , BuySell_2(prices,i+1,true,profit));
        }
        else {
            profit=Math.max(prices[i]+BuySell_2(prices,i+1,true,profit),BuySell_2(prices,i+1,false,profit));
        }
        return profit;
    }
}
