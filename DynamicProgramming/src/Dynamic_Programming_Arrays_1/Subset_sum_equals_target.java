package Dynamic_Programming_Arrays_1;

public class Subset_sum_equals_target {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        int target=5;
        boolean val1=checkSubsetRecursion(nums,nums.length-1,target);
        System.out.println("Recursion : "+val1);

        boolean[][] dp=new boolean[nums.length][target+1];
        boolean val2= checkSubsetMemoization(nums,nums.length-1,target,dp);
        System.out.println("Memoization : "+val2);

        boolean val3=checkSubsetTabulation(nums,target);
        System.out.println("Tabulation : "+val3);


        boolean val4=checkSubset1D(nums,target);
        System.out.println("1D tabulation : "+val4);

    }

    private static boolean checkSubset1D(int[] nums, int target) {
        boolean dp[]=new boolean[target+1];

        dp[0]=true;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=target;j>=0;j--)
            {
                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[target];
    }

    private static boolean checkSubsetTabulation(int[] nums, int target) {
        boolean dp[][]=new boolean[nums.length][target+1];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=true;
        }

        dp[0][nums[0]]=true;

        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=target;j++)
            {
                boolean notTake=dp[i-1][j];
                boolean take=false;
                if(j>=nums[i])
                {
                    take=dp[i-1][j-nums[i]];
                }
                dp[i][j]=take || notTake;
            }
        }

        return dp[nums.length-1][target];


    }

    private static boolean checkSubsetMemoization(int[] nums, int i, int target,boolean[][] dp) {
        if(target==0)
        {
            return true;
        }
        if(i==0)
        {
            return (nums[i]==target);
        }

        if(dp[i][target]!=false)
        {
            return dp[i][target];
        }

        boolean notTake = checkSubsetMemoization(nums,i-1,target,dp);
        boolean take = false;

        if(target>=nums[i])
        {
            take = checkSubsetMemoization(nums,i-1,target-nums[i],dp);
        }

        return dp[i][target]=take || notTake;
    }

    private static boolean checkSubsetRecursion(int[] nums,int i, int target) {

        if(target==0)
        {
            return true;
        }
        if(i==0)
        {
            return nums[i]==target;
        }

        boolean notTake = checkSubsetRecursion(nums,i-1,target);
        boolean take = false;

        if(target>=nums[i])
        {
            take = checkSubsetRecursion(nums,i-1,target-nums[i]);
        }
        return take || notTake;

    }
}
