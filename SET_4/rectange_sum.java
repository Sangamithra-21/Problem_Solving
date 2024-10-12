package SET_4;

public class rectange_sum {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4,6},
                       {5,3,8,1,2},
                       {4,6,7,5,5},
                       {2,4,8,9,4}};

        int srow = 2;
        int erow = 3;
        int scol = 0;
        int ecol = 4;

        int sum = 0;

        for(int i=srow;i<=erow;i++)
        {
            for(int j=scol;j<=ecol;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum : "+sum);
    }
}
