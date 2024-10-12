package SET_4;

public class jump_game_2 {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,6,7};
        int lastJump = 0;
        int destination = arr.length-1;
        int coverage = 0;
        int jump=0;

        for(int i=0;i<arr.length;i++)
        {
            coverage = Math.max(coverage,i+arr[i]);

            if(i==lastJump)
            {
                lastJump = coverage;
                jump++;

                if(coverage>=destination)
                {
                    System.out.println(jump);
                    break;
                }
            }
        }
    }
}
