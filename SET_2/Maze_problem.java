package SET_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Maze_problem {
    public static void main(String[] args) {

        int[][] maze = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        int[] start = {0, 4};
        int[] destination = {4, 4};
        System.out.println("Shortest path  : "+(findSmallDistance(maze,start,destination)));

    }

    private static int findSmallDistance(int[][] maze, int[] start, int[] destination) {

        int[][] directions  = {{0,1},{1,0},{-1,0},{0,-1}};

        int row = maze.length;
        int col = maze[0].length;

        int[][] distances = new int[row][col];

        for(int[] arr : directions)
        {
            Arrays.fill(arr,Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        distances[start[0]][start[1]]=0;



        while(!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int currRow = curr[0];
            int currCol = curr[1];

            for(int[] dir  : directions)
            {
                int newRow = currRow;
                int newCol = currCol;
                int distance = distances[newRow][newCol];

                while(newRow+dir[0]>=0 && newRow+dir[0]<row && newCol+dir[1]>=0 && newCol+dir[1]<col && maze[newRow+dir[0]][newCol+dir[1]]==0)
                {
                    newRow += dir[0];
                    newCol += dir[1];
                    distance++;
                }
                if(distance<distances[newRow][newCol])
                {
                    distances[newRow][newCol]=distance;
                    queue.add(new int[]{newRow,newCol});
                }
            }
        }
        return distances[destination[0]][destination[1]]==Integer.MAX_VALUE ? -1 : distances[destination[0]][destination[1]] ;
    }
}
