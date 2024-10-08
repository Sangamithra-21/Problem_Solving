package SET_3;

public class RatMaze {
    public static void main(String[] args) {

        int[][] maze = {{1,0,0,0},
                        {1,1,1,0,1},
                        {0,1,0,0,1},
                        {0,1,1,0,1}};
        boolean[][] dp = new boolean[maze.length][maze[0].length];
        if(maze[0][0]==0) {System.out.println("0"); return;}

        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                if(i==0 && j==0) {
                    dp[i][j] = true;
                    continue;
                }

                if(maze[i][j]==0)
                {
                    dp[i][j]=false;
                    continue;
                }
                else {
                    boolean left = false;
                    boolean right = false;
                    if(i>0) left = dp[i-1][j];
                    if(j>0) right = dp[i][j-1];
                    dp[i][j] = left || right;
                }

            }
        }

        int res = dp[maze.length-1][maze[0].length-1]== false ? 0 : 1;

        for(boolean[] b : dp)
        {
            for(boolean a : b)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println(res);
    }
}
