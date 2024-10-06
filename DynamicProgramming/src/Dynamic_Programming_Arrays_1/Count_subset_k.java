package Dynamic_Programming_Arrays_1;

public class Count_subset_k {
    public static void main(String[] args) {
        int[] nums={5,2,6,4};
        int target=6;

        int count=countSubset(nums,target,nums.length-1);
        System.out.println("Number of subsets equals k - Recursion : "+count);

        int[][] dp=new int[nums.length][target+1];

        int count1=countSubsetMemoization(nums,target,nums.length-1,dp);
        System.out.println("Number of subsets equals k - Memoization : "+count1);

        int count2=countSubsetTabulation(nums,target,nums.length-1);
        System.out.println("Number of subsets equals k - Tabulation : "+count2);

        int count3=countSubsetTabulatio1D(nums,target);
        System.out.println("Number of subsets equals k - Tabulation(1D) : "+count3);




    }

    private static int countSubsetTabulatio1D(int[] nums, int target) {

        boolean[] dp=new boolean[target+1];
        int[] dummy=new int[target+1];
       dp[0]=true;
       dummy[0]=1;
       for(int ele : nums)
       {
           for(int j=target;j>=ele;j--)
           {
               if(dp[j-ele])
               {
                   dp[j]=true;
                   dummy[j]+=dummy[j-ele];
               }
           }
        }

        return dummy[target];
    }

    private static int countSubsetTabulation(int[] nums, int target, int index) {

        int[][] dp=new int[nums.length][target+1];

        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=1;
        }
        dp[0][nums[0]]=1;
        int take=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=target;j++)
            {
                if(j>=nums[i]) {
                    take = dp[i - 1][j - nums[i]];
                }
                int notTake = dp[i-1][j];

                dp[i][j]=take+notTake;
            }
        }

        return dp[nums.length-1][target];

    }

    private static int countSubsetMemoization(int[] nums, int target, int i,int[][] dp) {
        if(target==0)
        {
           return 1;
        }
        if(i==0)
        {
            if(target==nums[i])
            {
                return 1;
            }
            else {
                return 0;
            }
        }

        if(dp[i][target]!=0)
        {
            return dp[i][target];
        }

        int notTake = countSubsetMemoization(nums,target,i-1,dp);
        int take=0;
        if(target>=nums[i])
        {
            take=countSubsetMemoization(nums,target-nums[i],i-1,dp);
        }
        return dp[i][target]=take+notTake;
    }

    private static int countSubset(int[] nums, int target, int i) {

        if(target==0)
        {
            return 1;
        }
        if(i==0)
        {
            if(target==nums[i])
            {
                return 1;
            }
            else {
                return 0;
            }
        }

        int notTake=countSubset(nums,target,i-1);
        int take=0;
        if(target>=nums[i])
        {
            take=countSubset(nums,target-nums[i],i-1);
        }
        return take+notTake;
    }
}
