package Dynamic_Programming_BuySell;

public class BuySell_3 {
    public static void main(String[] args) {

        int[] prices = {3,3,5,0,0,3,1,4};
        int profit = buySellRecursion(prices,0,1,2);
        System.out.println("Recursion : "+profit);


    }

    private static int buySellRecursion(int[] prices, int i, int buy, int cap) {
        if(cap==0)
        {
            return 0;
        }
        if(i==prices.length)
        {
            return 0;
        }

        if(buy==1)
        {
            return Math.max(-1*prices[i]+buySellRecursion(prices,i+1,0,cap),buySellRecursion(prices,i+1,1,cap));
        }
        else {
            return Math.max(prices[i]+buySellRecursion(prices,i+1,1,cap-1),buySellRecursion(prices,i+1,0,cap));
        }
    }
}
