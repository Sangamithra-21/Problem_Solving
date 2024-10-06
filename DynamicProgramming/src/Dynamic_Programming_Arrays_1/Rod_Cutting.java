package Dynamic_Programming_Arrays_1;

public class Rod_Cutting {
    public static void main(String[] args) {

        int[] price={3,5,6,7,10,12};
        int n=price.length;

        int val=rodCuttingRecursion(price,n,price.length-1);
        System.out.println("Recursion : "+val);
    }

    private static int rodCuttingRecursion(int[] price, int target, int i) {

        if(i==0)
        {
            return target*price[0];
        }

        int notTake=rodCuttingRecursion(price,target,i-1);
        int take=Integer.MIN_VALUE;
        if(target>=i)
        {
            take=price[i]+rodCuttingRecursion(price,target-(i+1),i);
        }

        return Math.max(take,notTake);
    }
}
