package Dynamic_Programming_Arrays_2;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,2,3};

        int count1 = LCSRecursion(nums,0,-1);
        System.out.println("Recursion : "+count1);


    }

    private static int LCSRecursion(int[] nums, int i,int prev) {
        if(i==nums.length)
        {
            return 0;
        }
        int notTake = LCSRecursion(nums,i+1,prev);
        int take = 0;
        if(prev==-1 || nums[i]>nums[prev])
        {
            take = 1+LCSRecursion(nums,i+1,i);
        }
        return Math.max(take,notTake);
    }
}
