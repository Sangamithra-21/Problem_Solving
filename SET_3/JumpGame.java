package SET_3;

public class JumpGame {
    public static void main(String[] args) {
        //Jump Game 1
        int[] nums = {2,3,1,1,4};
        int end = nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i]>=end)
            {
                end = i;
            }
        }
        System.out.println("JumpGame 1:"+(end==0?true : false));

        //Jump Game 2
        System.out.println("Jump game 2 : "+(jump(nums)));




    }
    public static int jump(int[] nums) {
        int coverage = 0;
        int destination = nums.length-1;
        int jumps = 0;
        int lastJump = 0;

        if(nums.length==1) return 0;

        for(int i=0;i<nums.length;i++)
        {
            coverage = Math.max(coverage,i+nums[i]);

            if(i==lastJump)
            {
                lastJump = coverage;
                jumps++;

                if(coverage>=destination)
                {
                    return jumps;
                }
            }


        }
        return jumps;
    }
}
