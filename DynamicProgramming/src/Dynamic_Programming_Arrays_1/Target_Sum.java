package Dynamic_Programming_Arrays_1;

public class Target_Sum {
    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1};
        int target = 3;

        int total = 0;
        for (int ele : nums) {
            total += ele;
        }

        int newTarget = (total - target) / 2;

        int val = targetSum(nums, newTarget);
        System.out.println("Partiton count: " + val);
    }

    private static int targetSum(int[] nums, int Target) {

        int[][] dp=new int[nums.length][Target+1];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=1;
        }
        dp[0][nums[0]]=1;
        int take=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=Target;j++)
            {
                if(j>=nums[i]) {
                    take = dp[i - 1][j - nums[i]];
                }
                int notTake = dp[i-1][j];

                dp[i][j]=take+notTake;
            }
        }

        return dp[nums.length-1][Target];
    }
}
