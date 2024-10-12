package SET_4;

import java.util.ArrayList;
import java.util.List;

public class word_search {
    public static void main(String[] args) {
        char[][] mat = {{'D', 'E', 'M', 'X', 'B'},
                {'A', 'O', 'E', 'P', 'E'},
                {'D', 'D', 'C', 'O', 'D'},
                {'E', 'B', 'E', 'D', 'S'},
                {'C', 'P', 'Y', 'E', 'N'}};
        String word = "CODE";

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==word.charAt(0))
                {
                    List<int[]> list = new ArrayList<>();
                    searchWord(mat,word,i,j,0,list);
                }
            }
        }

    }

    private static void searchWord(char[][] mat, String word, int row, int col, int ind, List<int[]> list) {
        if(row<0 || row>=mat.length || col<0 || col>=mat[0].length || word.charAt(ind)!=mat[row][col])
        {
            return;
        }

        list.add(new int[]{row,col});

        if(ind==word.length()-1)
        {
            printPath(list);
        }
        else {
            int[] rowDir = {-1,-1,-1,0,0,1,1,1};
            int[] colDir = {-1,0,1,-1,1,-1,0,1};

            for(int d=0;d<8;d++)
            {
                searchWord(mat,word,row+rowDir[d],col+colDir[d],ind+1,list);
            }
        }

        list.remove(list.size()-1);
    }

    private static void printPath(List<int[]> list) {
        System.out.print("[");
        for(int[] d : list)
        {
            System.out.print("("+d[0]+","+d[1]+")");
        }
        System.out.println("]");
    }
}