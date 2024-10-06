package Dynamic_Programming_Arrays_1;

public class Partition_subset_min_diff {
    public static void main(String[] args) {
        int[] nums={3,2,7};


        int num=find(nums);
        System.out.println("Partition with Min Difference : "+num);


        int total=0;
        for(int ele : nums)
        {
            total+=ele;
        }
        boolean[][] dp=new boolean[nums.length][total+1];
        partitionSubset(nums,dp,total);

    }

    private static void partitionSubset(int[] nums, boolean[][] dp,int total) {

        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=true;
        }

        dp[0][nums[0]]=true;

        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                boolean take=false;
                if(j>=nums[i])
                {
                    take=dp[i-1][j-nums[i]];
                }
                boolean notTake = dp[i-1][j];
                dp[i][j]=take || notTake;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<dp[0].length;i++)
        {
            if(dp[nums.length-1][i])
            {
               int sum1=i;
               int sum2=total-sum1;
               min=Math.min(min,Math.abs(sum1-sum2));
            }
        }
        System.out.println("Minimum Difference : "+min);
    }



    private static int find(int[] nums)
    {
        int total=0;
        for(int ele : nums)
        {
            total+=ele;
        }

        int target=total/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int ele : nums)
        {
            for(int j=target;j>=ele;j--)
            {
                dp[j]= dp[j] || dp[j-ele];
            }
        }

        int sum1=0;
        for(int k=target;k>=0;k--)
        {
            if(dp[k])
            {
                sum1=k;
                break;
            }
        }

        int sum2=total-sum1;
        return Math.abs(sum1-sum2);
    }
}
